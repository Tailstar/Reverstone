package us.tailstar.reverstone;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(Blocks.STONE), new ItemStack(Blocks.COBBLESTONE), 0);
    }
}
