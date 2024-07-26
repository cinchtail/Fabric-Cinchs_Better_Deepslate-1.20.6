package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BLACKSTONE_SWORD = registerItem("blackstone_sword",
            new SwordItem(ModToolMaterial.BLACKSTONE, (new Item.Settings())
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.BLACKSTONE, 3, -2.4F))));
    public static final Item BLACKSTONE_PICKAXE = registerItem("blackstone_pickaxe",
            new PickaxeItem(ModToolMaterial.BLACKSTONE, (new Item.Settings())
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.BLACKSTONE, 1.0F, -2.8F))));
    public static final Item BLACKSTONE_AXE = registerItem("blackstone_axe",
            new AxeItem(ModToolMaterial.BLACKSTONE, (new Item.Settings())
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.BLACKSTONE, 7.0F, -3.2F))));
    public static final Item BLACKSTONE_SHOVEL = registerItem("blackstone_shovel",
            new ShovelItem(ModToolMaterial.BLACKSTONE, (new Item.Settings())
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.BLACKSTONE, 1.5F, -3.0F))));
    public static final Item BLACKSTONE_HOE = registerItem("blackstone_hoe",
            new HoeItem(ModToolMaterial.BLACKSTONE, (new Item.Settings())
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.BLACKSTONE, -1.0F, -2.0F))));
    public static final Item DEEPSLATE_SWORD = registerItem("deepslate_sword",
            new SwordItem(ModToolMaterial.DEEPSLATE, (new Item.Settings())
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.DEEPSLATE, 3, -2.4F))));
    public static final Item DEEPSLATE_PICKAXE = registerItem("deepslate_pickaxe",
            new PickaxeItem(ModToolMaterial.DEEPSLATE, (new Item.Settings())
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.DEEPSLATE, 1.0F, -2.8F))));
    public static final Item DEEPSLATE_AXE = registerItem("deepslate_axe",
            new AxeItem(ModToolMaterial.DEEPSLATE, (new Item.Settings())
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.DEEPSLATE, 7.0F, -3.2F))));
    public static final Item DEEPSLATE_SHOVEL = registerItem("deepslate_shovel",
            new ShovelItem(ModToolMaterial.DEEPSLATE, (new Item.Settings())
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.DEEPSLATE, 1.5F, -3.0F))));
    public static final Item DEEPSLATE_HOE = registerItem("deepslate_hoe",
            new HoeItem(ModToolMaterial.DEEPSLATE, (new Item.Settings())
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.DEEPSLATE, -1.0F, -2.0F))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CinchsBetterDeepslate.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CinchsBetterDeepslate.LOGGER.info("Registering Mod Items for " + CinchsBetterDeepslate.MOD_ID);
    }
}