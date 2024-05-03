package pichin.go.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pichin.go.FirstMod;

    public class ModItemGroups {
        public static final ItemGroup SAO_Weapons = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.Mod_ID, "bluerose"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.SAO_Weapons")).icon(() -> new ItemStack(ModItems.BLUEROSE)).entries((displayContext, entries) -> {
            entries.add(ModItems.BLUEROSE);
            entries.add(ModItems.ELUCIDATOR);

        }).build());
        public static final ItemGroup SAO_Materials = Registry.register(Registries.ITEM_GROUP, new Identifier(FirstMod.Mod_ID, "demon_ingot"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.SAO_Materials")).icon(() -> new ItemStack(ModItems.DEMON_INGOT)).entries((displayContext, entries) -> {
            entries.add(ModItems.DEMON_INGOT);
            entries.add(ModItems.ROSE_CRYSTAL);

        }).build());


        public static void registerItemGroups(){
            FirstMod.LOGGER.info("Registering Item Groups for " + FirstMod.Mod_ID);
    }
}
