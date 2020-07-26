package voronoiaoc.byg.common.world.feature.features.overworld.trees.enchanted.green;

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

public class GreenEnchantedTree1 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public GreenEnchantedTree1(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 19 + rand.nextInt(5);
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
                    this.treeLog(treeBlockSet, worldIn, mainmutable, boundsIn);

                    mainmutable.move(Direction.UP);
                }
                mainmutable.setPos(pos);

                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 8, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 7, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 7, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 4, -3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 3, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 3, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 3, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 17, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 11, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 8, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 7, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 7, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 7, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 6, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 6, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 5, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 4, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 3, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 3, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 3, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 3, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 3, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 2, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 1, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 1, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 1, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 1, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.GREEN_ENCHANTED_LEAVES.getDefaultState(), boundingBox);
        }
    }



}