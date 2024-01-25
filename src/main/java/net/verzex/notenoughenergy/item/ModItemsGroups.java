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

    public static final ItemGroup аNEE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughEnergy.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("Not Enough Energy"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM_ROD);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.CHAO_FRUIT);
                        entries.add(ModItems.IRON_PLATE);
                        entries.add(ModItems.FIRE_BOW);
                        entries.add(ModItems.SMALL_COPPER_WIRES);
                        entries.add(ModItems.IRON_CORNER);
                        entries.add(ModItems.IRON_MECHANISM_CASE);
                        entries.add(ModItems.BIG_IRON_PLATE);
                        entries.add(ModItems.MELTED_IRON_INGOT);
                        entries.add(ModItems.GOLD_PLATE);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.CHAO_PICKAXE);
                        entries.add(ModItems.CHAO_AXE);
                        entries.add(ModItems.CHAO_SWORD);
                        entries.add(ModItems.CHAO_SHOVEL);
                        entries.add(ModBlocks.IRON_CASE);


                    }).build());

   public static void RegisterItemGroups() {


       NotEnoughEnergy.LOGGER.info("Registering Item Groups for " + NotEnoughEnergy.MOD_ID);
   }

}
