package net.verzex.notenoughenergy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.verzex.notenoughenergy.NotEnoughEnergy;
import net.verzex.notenoughenergy.block.ModBlocks;

public class ModItemsGroups {

    public static final ItemGroup NEE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughEnergy.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("Not Enough Energy"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM_ROD);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.IRON_PLATE);
                        entries.add(ModItems.MELTED_IRON_INGOT);
                        entries.add(ModItems.GOLD_PLATE);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.CHAO_PICKAXE);
                        entries.add(ModBlocks.IRON_CASE);


                    }).build());

   public static void RegisterItemGroups() {


       NotEnoughEnergy.LOGGER.info("Registering Item Groups for " + NotEnoughEnergy.MOD_ID);
   }

}
