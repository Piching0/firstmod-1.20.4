package pichin.go.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pichin.go.FirstMod;

public class ModItems {
    public static final Item DEMON_INGOT = registerItem("demon_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_CRYSTAL = registerItem("rose_crystal", new Item(new FabricItemSettings()));

    public static final Item ELUCIDATOR = registerItem("elucidator",
            new SwordItem(ModToolMaterial.DEMON_INGOT, 10240, 2.5f, new FabricItemSettings().maxCount(1)));
    public static final Item BLUEROSE = registerItem("bluerose",
            new SwordItem(ModToolMaterial.ROSE_CRYSTAL, 8192, 3f,new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DEMON_INGOT);
        entries.add(ROSE_CRYSTAL);
    }
    private static void  addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLUEROSE);
        entries.add(ELUCIDATOR);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.Mod_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.Mod_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
