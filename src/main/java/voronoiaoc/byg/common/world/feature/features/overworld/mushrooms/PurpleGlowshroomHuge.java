package voronoiaoc.byg.common.world.feature.features.overworld.mushrooms;

import com.mojang.serialization.Codec;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

public class PurpleGlowshroomHuge extends BYGAbstractTreeFeature<NoneFeatureConfiguration> {

    public PurpleGlowshroomHuge(Codec<NoneFeatureConfiguration> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, WorldGenLevel worldIn, Random rand, BlockPos pos, BoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.MutableBlockPos mainmutable = new BlockPos.MutableBlockPos().set(pos);

        if (pos.getY() + randTreeHeight + 1 < 256) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.below(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                this.treeLog(changedBlocks, worldIn, mainmutable.offset(0, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.offset(0, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.offset(0, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.offset(0, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.offset(0, 4, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, 4, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, 4, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, 5, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, 5, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, 5, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, 6, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, 6, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, 6, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, 7, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, 7, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 8, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, 13, 2), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.RED_GLOWSHROOM_STEM.defaultBlockState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.RED_GLOWSHROOM_STEM.defaultBlockState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        BlockPos.MutableBlockPos blockpos = new BlockPos.MutableBlockPos().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.PURPLE_GLOWSHROOM_BLOCK.defaultBlockState(), boundingBox);
        }
    }


    private boolean doesTreeFit(LevelSimulatedReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 0;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}