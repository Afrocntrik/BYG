package voronoiaoc.byg.common.world.feature.features.overworld.trees.jacaranda;

import com.mojang.serialization.Codec;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

//THIS FEATURE MUST BE REGISTERED & ADDED TO A BIOME!
public class IndigoJacarandaTree extends BYGAbstractTreeFeature<NoneFeatureConfiguration> {
    private static final BlockState LOG = BYGBlockList.JACARANDA_LOG.defaultBlockState();
    private static final BlockState LEAVES = BYGBlockList.INDIGO_JACARANDA_LEAVES.defaultBlockState();
    private static final BlockState BEENEST = Blocks.BEE_NEST.defaultBlockState();

    public IndigoJacarandaTree(Codec<NoneFeatureConfiguration> configIn) {
        super(configIn);
        //setSapling((net.minecraftforge.common.IPlantable) BYGBlockList.JACARANDA_SAPLING);
    }

    protected static boolean canTreeReplace(LevelSimulatedReader genBaseReader, BlockPos blockPos) {
        return canLogPlaceHere(genBaseReader, blockPos
        );
    }

    public boolean place(Set<BlockPos> changedBlocks, WorldGenLevel worldIn, Random rand, BlockPos pos, BoundingBox boundsIn, boolean isSapling) {

        int randTreeHeight = rand.nextInt(3) + rand.nextInt(5) + 9;
        //Positions
        int posX = pos.getX();
        int posY = pos.getY();
        int posZ = pos.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < 256) {
            BlockPos blockposdown = pos.below();
            if (!isDesiredGroundwDirtTag(worldIn, blockposdown, Blocks.GRASS_BLOCK)) {
                return false;
            } else {

                //this.setGroundBlockAt(worldIn, blockposdown, pos, Blocks.DIRT.getDefaultState());
//                //this.setGroundBlockAt(worldIn, blockposdown.west(), pos, Blocks.DIRT.getDefaultState());

//                //this.setGroundBlockAt(worldIn, blockposdown.east(), pos, Blocks.DIRT.getDefaultState());

//                //this.setGroundBlockAt(worldIn, blockposdown.south(), pos, Blocks.DIRT.getDefaultState());

//                //this.setGroundBlockAt(worldIn, blockposdown.north(), pos, Blocks.DIRT.getDefaultState());


                Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);//Crashes on 0.
                int posY1 = 2 - rand.nextInt(1);//Crashes on 0.
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;


                for (int buildTrunk = 0; buildTrunk < randTreeHeight; ++buildTrunk) {
                    if (buildTrunk >= randTreeHeight2 && posY1 < 0) { //Unknown
                        posX1 += direction.getStepX();
                        posZ1 += direction.getStepZ();
                        ++posY1;
                    }
                    int logplacer = posY + buildTrunk;
                    int logplacer2 = posY;
                    int logplacer3 = posY + randTreeHeight - 3;
                    int logplacer4 = posY + randTreeHeight - 1;
                    int logplacer5 = posY + randTreeHeight - 2;

                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    BlockPos blockpos2 = new BlockPos(posX1, logplacer2, posZ1);
                    BlockPos blockpos3 = new BlockPos(posX1, logplacer3, posZ1);
                    BlockPos blockpos4 = new BlockPos(posX1, logplacer4, posZ1);
                    BlockPos blockpos5 = new BlockPos(posX1, logplacer5, posZ1);


                    int logPreset = rand.nextInt(14) + 1;

                    this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                    if (rand.nextInt(3) == 0) {
                        this.treelog(changedBlocks, worldIn, blockpos2.south(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos2.north(), boundsIn);
                        if (logPreset == 0) {
                            this.treelog(changedBlocks, worldIn, blockpos2.south().above(), boundsIn);
                        } else if (logPreset == 2) {
                            this.treelog(changedBlocks, worldIn, blockpos2.north().above(), boundsIn);
                        } else if (logPreset == 10) {
                            this.treelog(changedBlocks, worldIn, blockpos2.west().above(), boundsIn);
                        }

                        if (rand.nextInt(3) == 1) {
                            this.treelog(changedBlocks, worldIn, blockpos2.east(), boundsIn);
                        } else if (rand.nextInt(4) == 1) {
                            this.treelog(changedBlocks, worldIn, blockpos2.west(), boundsIn);
                        }
                    }
                    if (rand.nextInt(3) == 2) {
                        this.treelog(changedBlocks, worldIn, blockpos2.west(), boundsIn);
                    }
                    this.treelog(changedBlocks, worldIn, blockpos3.west(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.south(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.east(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.north(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.west(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.south(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.east(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos3.north(2), boundsIn);

                    this.treelog(changedBlocks, worldIn, blockpos4.west(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos4.south(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos4.east(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos4.north(2), boundsIn);

                    this.treelog(changedBlocks, worldIn, blockpos5.west(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.south(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.east(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.north(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.west(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.south(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.east(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.north(4), boundsIn);

                    this.treelog(changedBlocks, worldIn, blockpos5.north(5).below().west(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.east(5).below().north(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.south(5).below().east(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos5.west(5).below().south(), boundsIn);

                }
                int leavePreset = rand.nextInt(1) + 1;
                {
                    if (leavePreset == 1) {
                        int leavessquarespos = 1;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                                for (int posYLeafHeight = 0; posYLeafHeight <= 3; ++posYLeafHeight) {
                                    this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 1, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1 - 2, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + posYLeafHeight - 3, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 6, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 2, posZ1 - 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 3, posZ1 - 4, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 5, posZ1 - 4, boundsIn, changedBlocks);

                                    if (posYLeafHeight <= 2) {
                                        this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 3, posZ1 - 5, boundsIn, changedBlocks);
                                    }
                                    if (posYLeafHeight <= 1) {
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 2, posZ1 - 4, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 1, posZ1 - 3, boundsIn, changedBlocks);
                                    }
                                    if (posYLeafHeight <= 2) {
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight + posYLeafHeight - 5, posZ1 - 4, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 3, posZ1 - 3, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight + posYLeafHeight - 2, posZ1 - 1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 3, topTrunkHeight + posYLeafHeight - 2, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 4, topTrunkHeight + posYLeafHeight - 2, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 5, topTrunkHeight + posYLeafHeight - 3, posZ1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 6, topTrunkHeight + posYLeafHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 5, topTrunkHeight + posYLeafHeight - 5, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 2, posZ1 + 3, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 3, posZ1 + 4, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 4, posZ1 + 6, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 2, posZ1 + 2, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 - 4, topTrunkHeight + posYLeafHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 4, topTrunkHeight + posYLeafHeight - 2, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight + posYLeafHeight - 2, posZ + 1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 - 5, topTrunkHeight + posYLeafHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - posYLeafHeight, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 3, topTrunkHeight - posYLeafHeight - 2, posZ1 - 2, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 4, topTrunkHeight - posYLeafHeight - 2, posZ1 - 3, boundsIn, changedBlocks);


                                    }
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight + posYLeafHeight - 3, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 5, topTrunkHeight + posYLeafHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 5, topTrunkHeight + posYLeafHeight - 6, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 4, topTrunkHeight + posYLeafHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 4, topTrunkHeight + posYLeafHeight - 4, posZ1 - 1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 4, posZ1 + 5, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 6, posZ1 + 5, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 3, posZ1 + 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 3, posZ1 + 4, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 4, posZ1 + 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 5, posZ1 + 3, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight + posYLeafHeight - 3, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight + posYLeafHeight - 3, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 5, posZ1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 6, topTrunkHeight + posYLeafHeight - 6, posZ1 + 2, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 - 5, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1 - 4, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 - 4, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1 - 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 - 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 5, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 5, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 3, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 6, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 4, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 3, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 3, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 + 5, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight + posYLeafHeight - 5, posZ1 - 5, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 4, posZ1 - 5, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 1, topTrunkHeight + posYLeafHeight - 3, posZ1 + 2, boundsIn, changedBlocks);


                                    if (posYLeafHeight <= 1) {
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight + posYLeafHeight - 3, posZ1 - 6, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 3, topTrunkHeight + posYLeafHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 3, topTrunkHeight + posYLeafHeight - 2, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight + posYLeafHeight - 3, posZ1 + 5, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight + posYLeafHeight - 2, posZ1 + 5, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight + posYLeafHeight - 1, posZ1 + 2, boundsIn, changedBlocks);


                                    }
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight - 2, posZ1 - 6, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 4, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 4, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 3, topTrunkHeight, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 + 3, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1 + 4, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1 + 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1 + 4, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 + 4, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                    //this.leafs(worldIn, posX1 -1, topTrunkHeight + 3, posZ1 + 2, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight + 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight + 1, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 2, posZ1 + 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 1, posZ1 + 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight, posZ1 + 3, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight - 2, posZ1 + 3, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 5, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 5, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 4, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);


                                    this.leafs(worldIn, posX1 - 5, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 6, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 5, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);

                                    this.leafs(worldIn, posX1 - 3, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                    this.leafs(worldIn, posX1 - 2, topTrunkHeight - 1, posZ1 - 3, boundsIn, changedBlocks);

                                    //this.leafs(worldIn, posX1 - 3, topTrunkHeight + 5, posZ1 + 3, boundsIn, changedBlocks);


                                }
                            }
                        }
                    } else if (leavePreset == 2) {
                        int leavessquarespos = 2;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {

                            }
                        }
                    } else if (leavePreset == 3) {
                        int leavessquarespos = 2;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {

                            }
                        }
                    } else if (leavePreset == 4) {
                        int leavessquarespos = 2;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {

                            }
                        }
                    }
                }
            }

            return true;
            //}
        } else {
            return false;
        }
    }

    private boolean doesTreeFit(LevelSimulatedReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 1;

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

    //Log Placement
    private void treelog(Set<BlockPos> setlogblock, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, LOG, boundingBox);
        }

    }

    //Leaves Placement
    private void leafs(WorldGenLevel reader, int x, int y, int z, BoundingBox boundingBox, Set<BlockPos> blockPos) {
        BlockPos blockpos = new BlockPos(x, y, z);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, LEAVES, boundingBox);
        }

    }
}