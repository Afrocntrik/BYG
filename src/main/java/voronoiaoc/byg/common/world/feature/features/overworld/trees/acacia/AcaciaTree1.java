package voronoiaoc.byg.common.world.feature.features.overworld.trees.acacia;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class AcaciaTree1 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public AcaciaTree1(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    /**
     * TODO: Redo.
     */
    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 8;
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, isSapling)) {
                return false;
            } else {
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(treeBlockSet, worldIn, mainmutable.move(Direction.UP), boundsIn);
                }
                mainmutable.setPos(pos);

                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 0, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 1, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 2, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 3, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 4, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 5, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 6, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 7, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 8, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 9, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 9, 0), boundsIn);

                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 1, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 5, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 5, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 6, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 7, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 7, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 7, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 8, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, 8, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 9, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 10, 2), boundsIn);

                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 10, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 4), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.AMETRINE_BLOCK.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.PINE_LEAVES.getDefaultState(), boundingBox);
        }
    }



}