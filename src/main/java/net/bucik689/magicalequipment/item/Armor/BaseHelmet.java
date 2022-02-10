package net.bucik689.magicalequipment.item.Armor;

import javax.annotation.Nullable;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

public class BaseHelmet extends BaseArmorItem {
    public BaseHelmet(String itemName, ModArmorMaterial material, @Nullable String description,
            @Nullable String additionalDescription) {
        super(material, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.ARMOR_TAB), description,
                additionalDescription);
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
