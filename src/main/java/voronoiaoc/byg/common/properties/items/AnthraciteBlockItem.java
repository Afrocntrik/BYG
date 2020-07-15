package voronoiaoc.byg.common.properties.items;


import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AnthraciteBlockItem extends BlockItem {
    public AnthraciteBlockItem(Block blockIn, Item.Properties builder) {
        super(blockIn, builder);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 20000;
    }
}
