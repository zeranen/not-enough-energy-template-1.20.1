package net.verzex.notenoughenergy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.verzex.notenoughenergy.NotEnoughEnergy;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item IRON_CORNER = registerItem("iron_corner", new Item(new FabricItemSettings()));
    public static final Item IRON_MECHANISM_CASE = registerItem("iron_mechanism_case", new Item(new FabricItemSettings()));
    public static final Item BIG_IRON_PLATE = registerItem("big_iron_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATE = registerItem("iron_plate", new Item(new FabricItemSettings()));
    public static final Item MELTED_IRON_INGOT = registerItem("melted_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item GOLD_PLATE = registerItem("gold_plate", new Item(new FabricItemSettings()));
    public static final Item URANIUM_ROD = registerItem("uranium_rod", new Item(new FabricItemSettings()));
    public static final Item CHAO_PICKAXE = registerItem("chao_pickaxe",
            new PickaxeItem(ModToolMaterial.CHAO, 5, 3f, new FabricItemSettings()));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new Item(new FabricItemSettings().maxDamage(128)));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(URANIUM_ROD);
        entries.add(IRON_PLATE);
        entries.add(GOLD_PLATE);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughEnergy.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NotEnoughEnergy.LOGGER.info("Registering Mod Items for " + NotEnoughEnergy.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
