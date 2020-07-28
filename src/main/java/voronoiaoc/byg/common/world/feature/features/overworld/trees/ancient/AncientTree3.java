package voronoiaoc.byg.common.world.feature.features.overworld.trees.ancient;

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

public class AncientTree3 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public AncientTree3(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxHeight()) {
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
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 15, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 1, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 1, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 2, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 2, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 2, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 2, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 3, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 3, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 4, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 4, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 5, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 11, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 12, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 12, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 12, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 12, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 13, -6), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -6), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -5), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 13, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 13, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(5, 13, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 13, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 13, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 13, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, 13, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(5, 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(6, 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(6, 13, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 13, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 13, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 13, 5), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, 13, 5), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 14, -5), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 14, -4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 14, -4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 14, -4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 14, -4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 14, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 14, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 14, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 14, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, 14, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, 14, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 14, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-5, 14, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 14, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 14, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, 14, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 14, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(5, 14, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(4, 14, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 14, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 14, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 14, 4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 14, 5), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(0, 12, -6), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(-4, 12, -3), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(4, 12, -3), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(1, 12, -1), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(6, 12, 2), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(-2, 12, 4), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(3, 12, 5), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(-4, 13, 0), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(-2, 13, 2), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(0, 13, 4), boundsIn);
                this.roots(treeBlockSet, worldIn, mainmutable.add(1, 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 14, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, 7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, 7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 7), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 14, 7), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(-1, 14, -2), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(1, 14, 1), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(2, 14, 1), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(-3, 14, 2), boundsIn);
                this.leafs2(treeBlockSet, worldIn, mainmutable.add(-2, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, 2), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, Blocks.DARK_OAK_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, Blocks.DARK_OAK_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, Blocks.DARK_OAK_LEAVES.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs2(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.POLLEN_BLOCK.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void roots(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.WEEPING_ROOTS.getDefaultState(), boundingBox);
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