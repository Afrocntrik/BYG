package voronoiaoc.byg.common.world.feature.features.overworld.giantflowers;

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

public class AngelicaGiant extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public AngelicaGiant(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < 256) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, isSapling)) {
                return false;
            } else {
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 3, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 3, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 4, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 4, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, 4, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, 5, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 6, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 6, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 7, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 7, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 8, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.pollen(treeBlockSet, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.pollen(treeBlockSet, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, 2), boundsIn);
                this.pollen(treeBlockSet, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.pollen(treeBlockSet, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 1), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PLANT_STEM.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PLANT_STEM.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.WHITE_PETAL.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void pollen(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.POLLEN_BLOCK.getDefaultState(), boundingBox);
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