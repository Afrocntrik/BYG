package voronoiaoc.byg.common.world.feature.features.overworld.trees.meadow;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class MeadowTree2 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public MeadowTree2(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 4 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(treeBlockSet, worldIn, mainmutable, boundsIn);

                    mainmutable.move(Direction.UP);
                }
                mainmutable.setPos(pos);

                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 1, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 2, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 2, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 2, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 3, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 3, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 4, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -4), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 5, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 5, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 3, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 3, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 3, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 3, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 3, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight + 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 4, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 4, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 4, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 4, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 4, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 4, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight + 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight + 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 5, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 5, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 5, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 5, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 5, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-7, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 6, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 6, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 6, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 7, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 7, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 7, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 7, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight + 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight + 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight + 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight + 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight + 7, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-6, randTreeHeight + 7, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight + 7, 5), boundsIn);
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


}