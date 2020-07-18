package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import voronoiaoc.byg.core.byglists.BYGBlockList;
import voronoiaoc.byg.core.byglists.BYGFeatureList;

public class Volcano extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BYGBlockList.BLACK_SAND.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState()));
    static final RainType PRECIPATATION = RainType.RAIN;
    static final Category CATEGORY = Category.TAIGA;
    static final double DEPTH = 0.0F;
    static final double SCALE = 0.03F;
    static final float TEMPERATURE = 0.25F;
    static final float DOWNFALL = 0.8F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public Volcano() {
        super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
//        BYGFeatures.addVolcanicCarvers(this);
//        BYGFeatures.addLargeLavaLake(this);
        this.addFeature(GenerationStage.Decoration.RAW_GENERATION, BYGFeatureList.VOLCANO.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
    }
}
