package voronoiaoc.byg.common.properties;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import voronoiaoc.byg.client.textures.BYGMaterials;
import voronoiaoc.byg.common.properties.blocks.*;
import voronoiaoc.byg.common.properties.blocks.embur.EmburPlantBlock;
import voronoiaoc.byg.common.properties.blocks.embur.EmburVinesPlantBlock;
import voronoiaoc.byg.common.properties.blocks.flowers.*;
import voronoiaoc.byg.common.properties.blocks.grassblocks.*;
import voronoiaoc.byg.common.properties.blocks.scorched.ScorchedPlantBlock;
import voronoiaoc.byg.common.properties.blocks.sythian.BYGSythianPlantBlock;
import voronoiaoc.byg.common.properties.blocks.sythian.SythianSaplingBlock;
import voronoiaoc.byg.common.properties.blocks.sythian.SythianStalkBlock;
import voronoiaoc.byg.common.properties.blocks.warped.*;
import voronoiaoc.byg.common.properties.blocks.whaling.HangingBonesBlock;
import voronoiaoc.byg.common.properties.blocks.whaling.WhalingGrassBlock;
import voronoiaoc.byg.core.byglists.BYGBlockList;

public class BYGBlockProperties {
    public static class BYGFence extends FenceBlock {
        public BYGFence(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSand extends SandBlock {
        public BYGSand(int dustColor, String registryName) {
            super(dustColor, Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.2f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGFenceGate extends FenceGateBlock {
        public BYGFenceGate(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWoodSlab extends SlabBlock {
        public BYGWoodSlab(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStoneSlab extends SlabBlock {
        public BYGStoneSlab(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(2.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStoneWall extends WallBlock {
        public BYGStoneWall(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(2.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPressurePlate extends PressurePlateBlock {
        public BYGPressurePlate(String registryName) {
            super(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.5F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGButtons extends WoodButtonBlock {
        public BYGButtons(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.5F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGFlower extends FlowerBlock {
        public BYGFlower(String registryName) {
            super(Effects.SATURATION, 7,
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGFairySlipperFlower extends BYGFairySlipperBlock {
        public BYGFairySlipperFlower(String registryName) {
            super(Effects.SATURATION, 7,
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
                            .lightValue(8)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDoublePlant extends DoublePlantBlock {
        public BYGDoublePlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDoubleDamagePlant extends DoubleDamagePlantBlock {
        public BYGDoubleDamagePlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGDesertPlant extends BYGDesertPlants {
        public BYGDesertPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSnowyPlant extends BYGSnowyPlants {
        public BYGSnowyPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGBeachGrass extends BYGBeachGrassBlock {
        public BYGBeachGrass(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGLily extends LilyPadBlock {
        public BYGLily(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburLily extends NetherLilyBlock {
        public BYGEmburLily(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWaterSilk extends BYGWaterSilkBlock {
        public BYGWaterSilk(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .notSolid()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLeafPile extends BYGLeafPileBlock {
        public BYGLeafPile(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }


    public static class BYGTallGrass extends TallGrassBlock {
        public BYGTallGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWinterTallGrass extends BYGSnowyPlants {
        public BYGWinterTallGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPrairieGrass extends BYGPrairieGrassBlock {
        public BYGPrairieGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGAmaranth extends AmaranthBlock {
        public BYGAmaranth(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGAllium extends TallAlliumBlock {
        public BYGAllium(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPinkAllium extends TallPinkAlliumBlock {
        public BYGPinkAllium(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGIceBlock extends IceBlock {
        public BYGIceBlock(String registryName) {
            super(Block.Properties.create(Material.ICE)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPackedIceBlock extends Block {
        public BYGPackedIceBlock(String registryName) {
            super(Block.Properties.create(Material.PACKED_ICE)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGFrostMagma extends BYGFrostMagmaBlock {
        public BYGFrostMagma(String registryName) {
            super(Block.Properties.create(Material.PACKED_ICE)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .slipperiness(0.98F)
                    .lightValue(10)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }


    public static class BYGStoneFarmland extends BYGStoneFarmlandBlock {
        public BYGStoneFarmland(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGDaciteFarmland extends BYGDaciteFarmlandBlock {
        public BYGDaciteFarmland(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockOvergrownStoneBlock extends BYGOverGrownStoneBlock {
        public BlockOvergrownStoneBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)


            );
            setRegistryName(registryName);
        }
    }

    public static class BlockOvergrownDaciteBlock extends BYGOverGrownDaciteBlock {
        public BlockOvergrownDaciteBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)


            );
            setRegistryName(registryName);
        }
    }

    public static class BYGDirt extends Block {
        public BYGDirt(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }


    public static class BYGMud extends SoulSandBlock {
        public BYGMud(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .speedFactor(0.4F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGMeadowGrass extends BYGMeadowGrassBlock {
        public BYGMeadowGrass(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlowcelium extends BYGGlowCeliumBlock {
        public BYGGlowcelium(String registryName) {
            super(Block.Properties.create(BYGMaterials.GLOWCELIUM)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .lightValue(10)

            );
            setRegistryName(registryName);
        }
    }


    public static class BYGLeafFoilage extends LeafFoliageBlock {
        public BYGLeafFoilage(String registryName) {
            super(DyeColor.GREEN, Block.Properties.create(Material.LEAVES, MaterialColor.GRASS)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLeaves extends LeavesBlock {
        public BYGLeaves(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
        }
    }

    public static class BYGBloomingWitchhazelLeaves extends LeavesBlock {
        public BYGBloomingWitchhazelLeaves(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2F)
                    .tickRandomly()
                    .sound(SoundType.PLANT)
                    .notSolid()
                    .lightValue(12)

            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
        }
    }

    public static class BYGPetal extends Block {
        public BYGPetal(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2F)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNyliumSoulSand extends Block {

        public BYGNyliumSoulSand(String registryName) {
            super(Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.4F)
                    .speedFactor(0.6F)
            );
            setRegistryName(registryName);
        }
//        @OnlyIn(Dist.CLIENT)
//        public void animateTick(BlockState blockstate, World world, BlockPos pos, Random rand) {
//            VoxelShape shape = this.getShape(blockstate, world, pos, ISelectionContext.dummy());
//            Vec3d vec3d = shape.getBoundingBox().getCenter();
//            double getX = (double) pos.getX() + vec3d.x;
//            double getZ = (double) pos.getZ() + vec3d.z;
//
//            for (int idx = 0; idx < 15; ++idx) {
//                if (rand.nextBoolean()) {
//                    world.addParticle(BYGParticleList.NYLIUM_SOUL_SAND_AMBIENCE, getX + (double) (rand.nextFloat() / 5.0F), (double) pos.getY() + (double) rand.nextFloat(), getZ + (double) (rand.nextFloat() / 5.0F), 0.0D, 0.02D, 0.0D);
//                }
//            }
//
//        }
    }

    public static class BYGNyliumSoulSoil extends Block {

        public BYGNyliumSoulSoil(String registryName) {
            super(Block.Properties.create(Material.SAND)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.4F)
            );
            setRegistryName(registryName);
        }

    }

    public static class HangingBones extends HangingBonesBlock {
        public HangingBones(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class WhalingVines extends VineBlock {
        public WhalingVines(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class WhalingGrass extends WhalingGrassBlock {
        public WhalingGrass(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class ScorchedPlant extends ScorchedPlantBlock {
        public ScorchedPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCacti extends WarpedCactiBlock {
        public BYGWarpedCacti(String registryName) {
            super(Block.Properties.create(Material.CACTUS)
                    .sound(SoundType.CLOTH)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .lightValue(8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCoral extends BYGWarpedCoralPlantBlock {
        public BYGWarpedCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lightValue(8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedFanCoral extends BYGWarpedFinBlock {
        public BYGWarpedFanCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lootFrom(BYGBlockList.WARPED_CORAL)
                    .lightValue(8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedWallFanCoral extends BYGWarpedCoralWallFanBlock {
        public BYGWarpedWallFanCoral(String registryName) {
            super(Block.Properties.create(Material.OCEAN_PLANT)
                    .sound(SoundType.WET_GRASS)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lootFrom(BYGBlockList.WARPED_CORAL)
                    .lightValue(8)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedBush extends BYGWarpedBushBlock {
        public BYGWarpedBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .lightValue(8)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSythianStalk extends SythianStalkBlock {
        public BYGSythianStalk(String registryName) {
            super(Block.Properties.create(Material.BAMBOO)
                    .sound(SoundType.BAMBOO)
                    .hardnessAndResistance(0.2f)
                    .notSolid()
                    .tickRandomly()
                    .lightValue(8)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGEmburGelBlock extends HoneyBlock {
        public BYGEmburGelBlock(String registryName) {
            super(Block.Properties.create(Material.CLAY)
                    .sound(SoundType.field_226947_m_)
                    .notSolid()
                    .speedFactor(1.6F)
                    .slipperiness(0.6F)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburGelVine extends EmburVinesPlantBlock {
        public BYGEmburGelVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGEmburPlant extends EmburPlantBlock {
        public BYGEmburPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGEmberNylium extends EmburNyliumBlock {
        public BYGEmberNylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSythianSapling extends SythianSaplingBlock {
        public BYGSythianSapling(String registryName) {
            super(Block.Properties.create(Material.BAMBOO_SAPLING)
                    .sound(SoundType.BAMBOO_SAPLING)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
                    .tickRandomly()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSythianPlant extends BYGSythianPlantBlock {
        public BYGSythianPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGSythianNylium extends BYGSythianNyliumBlock {
        public BYGSythianNylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGOvergrownNetherrack extends BYGOvergrownNetherrackBlock {
        public BYGOvergrownNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGIvisPlant extends BYGIvisPlantBlock {
        public BYGIvisPlant(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGIvisPhylium extends BYGIvisPhyliumBlock {
        public BYGIvisPhylium(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F)
                    .tickRandomly()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWarpedCoralBlock extends Block {
        public BYGWarpedCoralBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(0.2f)
                    .lightValue(8)
                    .harvestTool(ToolType.AXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPollen extends BYGPollenBlock {
        public BYGPollen(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .doesNotBlockMovement()
                    .lightValue(9)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGThatch extends HayBlock {
        public BYGThatch (String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchCarpet extends CarpetBlock {
        public ThatchCarpet (String registryName) {
            super(DyeColor.BROWN, Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchStairs extends StairsBlock {
        public ThatchStairs (String registryName) {
            super(BYGBlockList.REED_THATCH.getDefaultState(), Block.Properties.from(BYGBlockList.REED_THATCH)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class ThatchSlab extends SlabBlock {
        public ThatchSlab(String registryName) {
            super(Block.Properties.create(Material.ORGANIC)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.5f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPoisonIvy extends PoisonIvyBlock {
        public BYGPoisonIvy(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSkyrisVine extends VineBlock {
        public BYGSkyrisVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGHangingVine extends HangingVinesBlock {
        public BYGHangingVine(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGHangingVinePlant extends HangingVinesPlantBlock {
        public BYGHangingVinePlant(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F)
                    .tickRandomly()
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }

    public static class BoricCampfire extends CampfireBlock {
        public BoricCampfire(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN)
                            .hardnessAndResistance(2.0F)
                            .sound(SoundType.WOOD)
                            .lightValue(14)
                            .tickRandomly()
                            .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLog extends LogBlock {
        public BYGLog(String registryName) {
            super(MaterialColor.WOOD,
                    Block.Properties.create(Material.WOOD)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWood extends RotatedPillarBlock {
        public BYGWood(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }

    //Saving this for later do not touch
//    @OnlyIn(Dist.CLIENT)
//    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
//        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
//    }

    public static class BYGOreAmetrine extends BYGOreBlock {
        public BYGOreAmetrine(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3.0f, 3.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGOrePendorite extends OreBlock {
        public BYGOrePendorite(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3.0f, 3.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPervadedNetherrack extends OreBlock {
        public BYGPervadedNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestLevel(4)
                    .lightValue(13)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class AnthraciteOre extends BYGOreBlock {
        public AnthraciteOre(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGREDGlowCane extends BYGGlowcane {
        public BYGREDGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.RED_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
                    .lightValue(10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPINKGlowCane extends BYGGlowcane {
        public BYGPINKGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PINK_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
                    .lightValue(10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPURPLEGlowCane extends BYGGlowcane {
        public BYGPURPLEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PURPLE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
                    .lightValue(10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBLUEGlowCane extends BYGGlowcane {
        public BYGBLUEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.BLUE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
                    .lightValue(10)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockCattail extends BYGRiverPlantBlock {
        public BlockCattail(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .notSolid()
                    .doesNotBlockMovement()
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBerryBush extends BlueBerryBush {
        public BYGBerryBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }
    }

    public static class BlockHugeGlowshroom extends HugeMushroomBlock {
        public BlockHugeGlowshroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()
                    .lightValue(12)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
        }

        @OnlyIn(Dist.CLIENT)
        public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
            return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
        }
    }

    public static class BYGPlanks extends Block {
        public BYGPlanks(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGScaffolding extends BYGScaffoldingBlock {
        public BYGScaffolding(String registryName) {
            super(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.SAND)
                    .sound(SoundType.SCAFFOLDING)
                    .hardnessAndResistance(0.0F, 0.0F)
                    .doesNotBlockMovement()
                    .variableOpacity()
                    .lightValue(12)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGCraftingTable extends BYGCraftingTableBlock {
        public BYGCraftingTable(String registryName) {
            super(Block.Properties.from(Blocks.CRAFTING_TABLE)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGDoors extends DoorBlock {
        public BYGDoors(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGTrapdoors extends TrapDoorBlock {
        public BYGTrapdoors(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWoodStairs extends StairsBlock {
        public BYGWoodStairs(String registryName) {
            super(Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }


    public static class BYGStoneStairs extends StairsBlock {
        public BYGStoneStairs(String registryName) {
            super(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.from(Blocks.COBBLESTONE)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(2.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }


    public static class BlockBookshelf extends BookshelfBlock {
        public BlockBookshelf(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlowCaneBlock extends Block {
        public BYGGlowCaneBlock(String registryName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStone extends Block {
        public BYGStone(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5F, 6.0F)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGNetherrack extends Block {
        public BYGNetherrack(String registryName) {
            super(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(0.4F, 0.4F)
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPillar extends RotatedPillarBlock {
        public BYGPillar(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5F, 6.0F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStrippedLog extends LogBlock {
        public BYGStrippedLog(String registryName) {
            super(MaterialColor.WOOD,
                    Block.Properties.create(Material.WOOD, MaterialColor.WOOD)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0F)
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGLantern extends LanternBlock {
        public BYGLantern(String registryName) {
            super(Block.Properties.create(Material.IRON)
                    .sound(SoundType.LANTERN)
                    .hardnessAndResistance(3.5F)
                    .lightValue(15)
                    .notSolid()
                    .harvestTool(ToolType.PICKAXE)

            );
            setRegistryName(registryName);
        }
    }
}
