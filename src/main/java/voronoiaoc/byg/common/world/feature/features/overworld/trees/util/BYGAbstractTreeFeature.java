package voronoiaoc.byg.common.world.feature.features.overworld.trees.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.shapes.BitSetVoxelShapePart;
import net.minecraft.util.math.shapes.VoxelShapePart;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraftforge.common.Tags;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public abstract class BYGAbstractTreeFeature<T extends IFeatureConfig> extends Feature<T> {

    public BYGAbstractTreeFeature(Function<Dynamic<?>, ? extends T> function) {
        super(function);
    }

    public static boolean canLogPlaceHere(IWorldGenerationBaseReader worldReader, BlockPos blockPos) {
        return worldReader.hasBlockState(blockPos, (state) -> state.isAir() || state.isIn(BlockTags.LEAVES) || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.TALL_PLANTS || state.getMaterial() == Material.OCEAN_PLANT);
    }

    public boolean canLogPlaceHereWater(IWorldGenerationBaseReader worldReader, BlockPos blockPos) {
        return worldReader.hasBlockState(blockPos, (state) -> state.isAir() || state.isIn(BlockTags.LEAVES) || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.TALL_PLANTS || state.getMaterial() == Material.OCEAN_PLANT || state.getMaterial() == Material.WATER);
    }

    public boolean isAnotherTreeHere(IWorldGenerationBaseReader worldReader, BlockPos blockPos) {
        return worldReader.hasBlockState(blockPos, (state) -> {
            Block block = state.getBlock();
            return block.isIn(BlockTags.LOGS) || block.isIn(BlockTags.LEAVES);
        });
    }

    public boolean isAnotherTreeLikeThisHere(IWorldGenerationBaseReader worldReader, BlockPos blockPos, Block logBlock, Block leafBlock) {
        return worldReader.hasBlockState(blockPos, (state) -> {
            Block block = state.getBlock();
            return block == logBlock || block == leafBlock;
        });
    }


    /**
     * We use this to determine if a sapling's tree can grow at the given position.
     * This is likely if not guaranteed to be used in a for loop checking the surrounding in another method as it's useless like this.
     *
     * @param reader Gives us access to world.
     * @param pos Position to check.
     * @return Determine whether or not the position can support a sapling's tree.
     */
    public boolean canSaplingGrowHere(IWorldGenerationBaseReader reader, BlockPos pos) {
        return reader.hasBlockState(pos, (state) -> {
            Block block = state.getBlock();
            return block.isIn(BlockTags.LOGS) || block.isIn(BlockTags.LEAVES) || state.isAir() || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.TALL_PLANTS || state.getMaterial() == Material.OCEAN_PLANT || state.getMaterial() == Material.LEAVES || state.isIn(Tags.Blocks.DIRT);
        });
    }

    /**
     * Typically only ever used on trees that need to place in water.
     *
     * @param reader Gives us access to world.
     * @param pos Position to check.
     * @return Determines whether or not a log block can place here by checking several properties of the block on the given position.
     */
    public boolean canLogPlaceWater(IWorldGenerationBaseReader reader, BlockPos pos) {
        return reader.hasBlockState(pos, (state) -> state.isAir() || state.isIn(BlockTags.LEAVES) || state.getBlock() == Blocks.WATER || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.TALL_PLANTS || state.getMaterial() == Material.OCEAN_PLANT);
    }

    /**
     *
     * @param reader Gives us access to world.
     * @param pos Position to check.
     * @return Determines whether or not a position is air.
     */

    public boolean isAir(IWorldGenerationBaseReader reader, BlockPos pos) {
        return reader.hasBlockState(pos, BlockState::isAir);
    }

    public boolean isAirOrWater(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (state) -> state.isAir() || state.getBlock() == Blocks.WATER);
    }

    /**
     *
     * @param reader Gives us access to world.
     * @param pos Position to check.
     * @param desiredGroundBlock Allows to add other blocks that do not have the dirt tag.
     * @return Determines if the position is of the dirt tag or another block.
     */
    public static boolean isDesiredGroundwDirtTag(IWorldGenerationBaseReader reader, BlockPos pos, Block... desiredGroundBlock) {
        return reader.hasBlockState(pos, (state) -> {
            Block block = state.getBlock();
            for (Block block1 : desiredGroundBlock) {
                return Feature.isDirt(block) || block == block1;
            }
            return false;
        });
    }

    /**
     *
     * @param reader Gives us access to world.
     * @param pos Position to check.
     * @param desiredGroundBlock Add a blacklist of blocks that we want.
     * @return Determines if the position contains a block from our whitelist.
     */
    public boolean isDesiredGround(IWorldGenerationBaseReader reader, BlockPos pos, Block... desiredGroundBlock) {
        return reader.hasBlockState(pos, (state) -> {
            Block block = state.getBlock();
            for (Block block1 : desiredGroundBlock) {
                return block == block1;
            }
            return false;
        });
    }

    @Override
    public void setBlockState(IWorldWriter worldIn, BlockPos pos, BlockState state) {
        this.setBlockStateWithoutUpdates(worldIn, pos, state);
    }

    /**
     * Use this method if the canopy has a mirrored shape on both the X/Z axises.
     * Only used during sapling growth.
     *
     * @param reader            Gives us access to world.
     * @param pos               The start position of the feature from the decorator/position of the sapling.
     * @param treeHeight        The height of the tree trunk determined within the feature. Typically a random number.
     * @param canopyStartHeight The start height at which leaves begin to generate. I.E: "randTreeHeight - 15".
     * @param xDistance         Used to check the canopy's X offset blocks.
     * @param zDistance         Used to check the canopy's Z offset blocks.
     * @param isSapling         Boolean Passed in to determine whether or not the tree is being generated during world gen or with a sapling.
     * @param trunkPositions    Typically this is going to be the bottom most logs of the trunks for the tree.
     * @return Determine Whether or not a sapling can grow at the given position by checking the surrounding area.
     */

    public boolean doesSaplingHaveSpaceToGrow(IWorldGenerationBaseReader reader, BlockPos pos, int treeHeight, int canopyStartHeight, int xDistance, int zDistance, boolean isSapling, BlockPos... trunkPositions) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        //Skip if this is not a sapling.
        if (isSapling) {
            //Check the tree trunk and determine whether or not there's a block in the way.
            for (int yOffSet = 0; yOffSet <= treeHeight; yOffSet++) {
                if (!canSaplingGrowHere(reader, mutable.setPos(x, y + yOffSet, z))) {
                    return false;
                }
                //If the list of trunk positions(other than the center trunk) is greater than 0, we check each of these trunk positions from the bottom to the tree height.
                if (trunkPositions.length > 0) {
                    for (BlockPos trunkPos : trunkPositions) {
                        if (!canSaplingGrowHere(reader, mutable.setPos(trunkPos.getX(), trunkPos.getY() + yOffSet, trunkPos.getZ()))) {
                            return false;
                        }
                    }
                }
            }
            //We use canopyStartHeight instead of 0 because we want to check the area only in the canopy's area and not around the trunk. This makes our saplings much smarter and easier to grow.
            for (int yOffset = canopyStartHeight; yOffset <= treeHeight + 1; ++yOffset) {
                for (int xOffset = -xDistance; xOffset <= xDistance; ++xOffset) {
                    for (int zOffset = -zDistance; zOffset <= zDistance; ++zOffset) {
                        if (!canSaplingGrowHere(reader, mutable.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Use this method instead of the previous if the canopy does not have a mirror shape on the X/Z axises.
     * Only used during sapling growth.
     *
     * @param reader            Gives us access to world.
     * @param pos               The start position of the feature from the decorator/position of the sapling.
     * @param treeHeight        The height of the given tree.
     * @param canopyStartHeight The start height at which leaves begin to generate. I.E: "randTreeHeight - 15".
     * @param xNegativeDistance Used to check the canopy's negative X offset blocks.
     * @param zNegativeDistance Used to check the canopy's negative Z offset blocks.
     * @param xPositiveDistance Used to check the canopy's positive x offset blocks.
     * @param zPositiveDistance Used to check the canopy's positive Z offset blocks.
     * @param isSapling         Boolean passed in to determine whether or not the tree is being generated during world gen or with a sapling.
     * @param trunkPositions    Typically this is going to be the bottom most logs of the trunk for the tree.
     * @return Determine Whether or not a sapling can grow at the given position by checking the surrounding area.
     */

    public boolean doesSaplingHaveSpaceToGrow(IWorldGenerationBaseReader reader, BlockPos pos, int treeHeight, int canopyStartHeight, int xNegativeDistance, int zNegativeDistance, int xPositiveDistance, int zPositiveDistance, boolean isSapling, BlockPos... trunkPositions) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        //Skip if tree is being called during world gen.
        if (isSapling) {

            //Check the tree trunk and determine whether or not there's a block in the way.
            for (int yOffSet = 0; yOffSet <= treeHeight; yOffSet++) {
                if (!canSaplingGrowHere(reader, mutable.setPos(x, y + yOffSet, z))) {
                    return false;
                }

                //If the list of trunk positions(other than the center trunk) is greater than 0, we check each of these trunk positions from the bottom to the tree height.
                if (trunkPositions.length > 0) {
                    for (BlockPos trunkPos : trunkPositions) {
                        if (!canSaplingGrowHere(reader, mutable.setPos(trunkPos.getX(), trunkPos.getY() + yOffSet, trunkPos.getZ()))) {
                            return false;
                        }
                    }
                }
            }

            //We use canopyStartHeight instead of 0 because we want to check the area only in the canopy's area and not around the trunk. This makes our saplings much smarter and easier to grow.
            for (int yOffset = canopyStartHeight; yOffset <= treeHeight + 1; ++yOffset) {
                for (int xOffset = -xNegativeDistance; xOffset <= xPositiveDistance; ++xOffset) {
                    for (int zOffset = -zNegativeDistance; zOffset <= zPositiveDistance; ++zOffset) {
                        if (!canSaplingGrowHere(reader, mutable.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Checks the area surrounding the pos for any blocks using either the log or leaves tag.
     * Called only during world gen.
     *
     * @param reader Gives us access to world
     * @param pos The given position of either the feature during world gen or the sapling.
     * @param treeHeight The height of the given tree.
     * @param distance Checks the surrounding position
     * @param isSapling Boolean passed in to determine whether or not the tree is being generated during world gen or with a sapling.
     * @return Determines whether or not any tree is within the givem distance
     */
    public boolean isAnotherTreeNearby(IWorldGenerationBaseReader reader, BlockPos pos, int treeHeight, int distance, boolean isSapling) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        //Skip if tree is being spawned with a sapling.
        if (!isSapling) {
            for (int yOffset = 0; yOffset <= treeHeight + 1; ++yOffset) {
                for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                    for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                        if (isAnotherTreeHere(reader, mutable.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Checks the area surrounding the pos for a tree matching its wood/leaves block.
     * Called only during world gen
     *
     * @param reader Gives us access to world
     * @param pos The given position of either the feature during world gen or the sapling.
     * @param treeHeight The height of the given tree.
     * @param distance Checks the surrounding position
     * @param logBlock The log block we're checking for.
     * @param leafBlock The leaf block we're checking for.
     * @param isSapling Boolean passed in to determine whether or not the tree is being generated during world gen or with a sapling.
     * @return Determines whether or not the tree we're searching for is within the given distance.
     */

    public boolean isAnotherTreeLikeThisNearby(IWorldGenerationBaseReader reader, BlockPos pos, int treeHeight, int distance, Block logBlock, Block leafBlock, boolean isSapling) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        //Skip if tree is being spawned with a sapling.
        if (!isSapling) {
            for (int yOffset = 0; yOffset <= treeHeight + 1; ++yOffset) {
                for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                    for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                        if (!isAnotherTreeLikeThisHere(reader, mutable.setPos(x + xOffset, y + yOffset, z + zOffset), logBlock, leafBlock)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Use this to set the soil under large trunked trees. I.E: Baobab or Redwood.
     *
     * @param treeBlocksSet Gives us access to the tree block set where we add our trees blocks.
     * @param reader Gives us access to world
     * @param fillerBlock Typically this is the log of the tree we're trying to fill the base of.
     * @param earthBlock The block used under logs. Typically a block found in the dirt tag
     * @param boundingBox Bounding Box of our tree.
     * @param trunkPositions List of trunk positions where the base is built under the given positions.
     */

    public void buildBase(Set<BlockPos> treeBlocksSet, IWorldGenerationBaseReader reader, Block fillerBlock, Block earthBlock, MutableBoundingBox boundingBox, BlockPos... trunkPositions) {
        if (trunkPositions.length > 0) {
            BlockPos.Mutable mutableTrunk = new BlockPos.Mutable();
            for (BlockPos trunkPos : trunkPositions) {
                mutableTrunk.setPos(trunkPos);
                for (int fill = 1; fill <= 15; fill++) {
                    if (canLogPlaceHere(reader, mutableTrunk)) {
                        if (fill <= 7)
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, fillerBlock.getDefaultState(), boundingBox);
                        else
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, earthBlock.getDefaultState(), boundingBox);
                    } else {
                        if (isDesiredGround(reader, mutableTrunk, Blocks.PODZOL, Blocks.MYCELIUM, BYGBlockList.PODZOL_DACITE, BYGBlockList.OVERGROWN_STONE, BYGBlockList.GLOWCELIUM))
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, earthBlock.getDefaultState(), boundingBox);
                        fill = 15;
                    }
                    mutableTrunk.move(Direction.DOWN);
                }
            }
        }
    }

    /**
     * Use this to set the soil under large trunked trees. Has an extra parameter to specify when the earth block should start placing. I.E: Baobab or Redwood.
     *
     * @param treeBlocksSet Gives us access to the tree block set where we add our trees blocks.
     * @param reader Gives us access to world
     * @param earthBlockThreshold Used to specify when earthBlock starts placing.
     * @param fillerBlock Typically this is the log of the tree we're trying to fill the base of.
     * @param earthBlock The block used under logs. Typically a block found in the dirt tag
     * @param boundingBox Bounding Box of our tree.
     * @param trunkPositions List of trunk positions where the base is built under the given positions.
     */
    public void buildBase(Set<BlockPos> treeBlocksSet, IWorldGenerationBaseReader reader, int earthBlockThreshold, Block fillerBlock, Block earthBlock, MutableBoundingBox boundingBox, BlockPos... trunkPositions) {
        if (trunkPositions.length > 0) {
            BlockPos.Mutable mutableTrunk = new BlockPos.Mutable();
            for (BlockPos trunkPos : trunkPositions) {
                mutableTrunk.setPos(trunkPos);
                for (int fill = 1; fill <= 15; fill++) {
                    if (canLogPlaceHere(reader, mutableTrunk)) {
                        if (fill <= earthBlockThreshold)
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, fillerBlock.getDefaultState(), boundingBox);
                        else
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, earthBlock.getDefaultState(), boundingBox);
                    } else {
                        if (canLogPlaceHere(reader, mutableTrunk)) {
                            setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, fillerBlock.getDefaultState(), boundingBox);
                        } else {
                            if (isDesiredGround(reader, mutableTrunk, Blocks.PODZOL, Blocks.MYCELIUM, BYGBlockList.PODZOL_DACITE, BYGBlockList.OVERGROWN_STONE, BYGBlockList.GLOWCELIUM))
                                setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk, earthBlock.getDefaultState(), boundingBox);
                            fill = 15;
                        }
                    }
                    mutableTrunk.move(Direction.DOWN);
                }
            }
        }
    }

    /**
     * Use this to set the soil under small trunked trees.
     */

    public void setSoil(Set<BlockPos> treeBlocksSet, IWorldGenerationBaseReader reader, Block soil, MutableBoundingBox boundingBox, BlockPos... trunkPositions) {
        if (trunkPositions.length > 0) {
            BlockPos.Mutable mutableTrunk = new BlockPos.Mutable();
            for (BlockPos trunkPos : trunkPositions) {
                mutableTrunk.setPos(trunkPos);
                if (isDesiredGround(reader, mutableTrunk, Blocks.PODZOL, Blocks.MYCELIUM, BYGBlockList.PODZOL_DACITE, BYGBlockList.OVERGROWN_STONE, BYGBlockList.GLOWCELIUM))
                    setFinalBlockState(treeBlocksSet, (IWorldWriter) reader, mutableTrunk.move(Direction.DOWN), soil.getDefaultState(), boundingBox);
            }
        }
    }

    public final void setFinalBlockState(Set<BlockPos> treeBlockSet, IWorldWriter worldIn, BlockPos pos, BlockState blockState, MutableBoundingBox boundingBox) {
        this.setBlockStateWithoutUpdates(worldIn, pos, blockState);
        boundingBox.expandTo(new MutableBoundingBox(pos, pos));
        if (BlockTags.LOGS.contains(blockState.getBlock())) {
            treeBlockSet.add(pos.toImmutable());
        }
    }

    public void setBlockStateWithoutUpdates(IWorldWriter worldWriter, BlockPos blockPos, BlockState blockState) {
        worldWriter.setBlockState(blockPos, blockState, 18);
    }

    @Override
    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, T config) {
        return this.placeTree(worldIn, generator, rand, pos, config, false);
    }


    //Does all the dirty work calculating the leave distance.
    public boolean placeTree(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, T config, boolean isSapling) {
        Set<BlockPos> set = Sets.newHashSet();
        MutableBoundingBox mutableboundingbox = MutableBoundingBox.getNewBoundingBox();
        boolean flag = this.place(set, worldIn, rand, pos, mutableboundingbox, isSapling);
        if (mutableboundingbox.minX > mutableboundingbox.maxX) {
            return false;
        } else {
            List<Set<BlockPos>> list = Lists.newArrayList();
            int i = 6;

            for (int j = 0; j < 6; ++j) {
                list.add(Sets.newHashSet());
            }

            VoxelShapePart voxelshapepart = new BitSetVoxelShapePart(mutableboundingbox.getXSize(), mutableboundingbox.getYSize(), mutableboundingbox.getZSize());

            try (BlockPos.PooledMutable blockpos$pooledmutableblockpos = BlockPos.PooledMutable.retain()) {
                if (flag && !set.isEmpty()) {
                    for (BlockPos blockpos : Lists.newArrayList(set)) {
                        if (mutableboundingbox.isVecInside(blockpos)) {
                            voxelshapepart.setFilled(blockpos.getX() - mutableboundingbox.minX, blockpos.getY() - mutableboundingbox.minY, blockpos.getZ() - mutableboundingbox.minZ, true, true);
                        }

                        for (Direction direction : Direction.values()) {
                            blockpos$pooledmutableblockpos.setPos(blockpos).move(direction);
                            if (!set.contains(blockpos$pooledmutableblockpos)) {
                                BlockState blockstate = worldIn.getBlockState(blockpos$pooledmutableblockpos);
                                if (blockstate.has(BlockStateProperties.DISTANCE_1_7)) {
                                    list.get(0).add(blockpos$pooledmutableblockpos.toImmutable());
                                    this.setBlockStateWithoutUpdates(worldIn, blockpos$pooledmutableblockpos, blockstate.with(BlockStateProperties.DISTANCE_1_7, Integer.valueOf(1)));
                                    if (mutableboundingbox.isVecInside(blockpos$pooledmutableblockpos)) {
                                        voxelshapepart.setFilled(blockpos$pooledmutableblockpos.getX() - mutableboundingbox.minX, blockpos$pooledmutableblockpos.getY() - mutableboundingbox.minY, blockpos$pooledmutableblockpos.getZ() - mutableboundingbox.minZ, true, true);
                                    }
                                }
                            }
                        }
                    }
                }

                for (int l = 1; l < 6; ++l) {
                    Set<BlockPos> set1 = list.get(l - 1);
                    Set<BlockPos> set2 = list.get(l);

                    for (BlockPos blockpos1 : set1) {
                        if (mutableboundingbox.isVecInside(blockpos1)) {
                            voxelshapepart.setFilled(blockpos1.getX() - mutableboundingbox.minX, blockpos1.getY() - mutableboundingbox.minY, blockpos1.getZ() - mutableboundingbox.minZ, true, true);
                        }

                        for (Direction direction1 : Direction.values()) {
                            blockpos$pooledmutableblockpos.setPos(blockpos1).move(direction1);
                            if (!set1.contains(blockpos$pooledmutableblockpos) && !set2.contains(blockpos$pooledmutableblockpos)) {
                                BlockState blockstate1 = worldIn.getBlockState(blockpos$pooledmutableblockpos);
                                if (blockstate1.has(BlockStateProperties.DISTANCE_1_7)) {
                                    int k = blockstate1.get(BlockStateProperties.DISTANCE_1_7);
                                    if (k > l + 1) {
                                        BlockState blockstate2 = blockstate1.with(BlockStateProperties.DISTANCE_1_7, Integer.valueOf(l + 1));
                                        this.setBlockStateWithoutUpdates(worldIn, blockpos$pooledmutableblockpos, blockstate2);
                                        if (mutableboundingbox.isVecInside(blockpos$pooledmutableblockpos)) {
                                            voxelshapepart.setFilled(blockpos$pooledmutableblockpos.getX() - mutableboundingbox.minX, blockpos$pooledmutableblockpos.getY() - mutableboundingbox.minY, blockpos$pooledmutableblockpos.getZ() - mutableboundingbox.minZ, true, true);
                                        }

                                        set2.add(blockpos$pooledmutableblockpos.toImmutable());
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Template.func_222857_a(worldIn, 3, voxelshapepart, mutableboundingbox.minX, mutableboundingbox.minY, mutableboundingbox.minZ);
            return flag;
        }
    }


    /**
     *
     * @param treeBlockSet A set to add our tree's blocks for use in the feature.
     * @param worldIn Gives us access to world
     * @param rand An instance of Random which is only called once per method call.
     * @param pos The position of the feature or sapling
     * @param boundsIn The bounding box around our tree.
     * @param isSapling Boolean passed in to determine whether or not the tree is being generated during world gen or with a sapling.
     * @return Adds our blocks to the tree and determines whether or not a tree is allowed to generate/grow.
     */
    protected abstract boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling);
}