package voronoiaoc.byg.common.world.feature.features.overworld.trees.holly;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
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

public class HollyTree3 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public HollyTree3(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 18 + rand.nextInt(7);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);
        BlockPos.Mutable mainmutable2 = new BlockPos.Mutable(pos.offset(Direction.SOUTH));
        BlockPos.Mutable mainmutable3 = new BlockPos.Mutable(pos.offset(Direction.EAST));
        BlockPos.Mutable mainmutable4 = new BlockPos.Mutable(pos.offset(Direction.EAST).offset(Direction.SOUTH));

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, isSapling)) {
                return false;
            } else {

                setGroundBlock(worldIn, Blocks.DIRT, mainmutable, mainmutable2, mainmutable3, mainmutable4);
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(treeBlockSet, worldIn, mainmutable, boundsIn);
                    this.treeLog(treeBlockSet, worldIn, mainmutable2, boundsIn);
                    this.treeLog(treeBlockSet, worldIn, mainmutable3, boundsIn);
                    this.treeLog(treeBlockSet, worldIn, mainmutable4, boundsIn);
                    mainmutable.move(Direction.UP);
                    mainmutable2.move(Direction.UP);
                    mainmutable3.move(Direction.UP);
                    mainmutable4.move(Direction.UP);
                }
                mainmutable.setPos(pos);

                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 1, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 1, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight + 4, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 3), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 12, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, randTreeHeight - 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 16, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 16, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 16, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 16, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, randTreeHeight - 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(7, randTreeHeight - 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-5, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(6, randTreeHeight - 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 15, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 15, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 15, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 15, 6), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(5, randTreeHeight - 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 14, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 14, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 14, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 13, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 13, 5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 12, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 11, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, randTreeHeight - 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 9, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 8, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 8, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 7, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 7, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 7, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 6, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 6, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 5, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 5, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 4, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 4, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 3, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 3, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 3, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 2, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 2, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 2, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 1, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, randTreeHeight - 1, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, randTreeHeight - 1, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight - 1, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 1, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight - 1, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight - 1, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, randTreeHeight, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, randTreeHeight, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 1, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 2, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, randTreeHeight + 3, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.HOLLY_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.HOLLY_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, randomLeaves(), boundingBox);
        }
    }

    public BlockState randomLeaves() {
        Random random = new Random();
        int randomizer = random.nextInt(25);
        if (randomizer == 1)
            return BYGBlockList.HOLLY_BERRY_LEAVES.getDefaultState();
        else if (randomizer == 0)
            return BYGBlockList.HOLLY_LEAVES.getDefaultState();
        else
            return BYGBlockList.HOLLY_LEAVES.getDefaultState();
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