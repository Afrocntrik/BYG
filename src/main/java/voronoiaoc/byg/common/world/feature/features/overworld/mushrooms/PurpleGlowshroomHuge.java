package voronoiaoc.byg.common.world.feature.features.overworld.mushrooms;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class PurpleGlowshroomHuge extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public PurpleGlowshroomHuge(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 4 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < 256) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 4, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 4, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 5, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 5, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 5, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 6, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 6, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 6, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 7, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 7, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, 2), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.RED_GLOWSHROOM_STEM.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.RED_GLOWSHROOM_STEM.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.PURPLE_GLOWSHROOM_BLOCK.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 0;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!isQualifiedForLog(reader, pos.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}