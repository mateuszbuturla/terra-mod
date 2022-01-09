package bucik689.magicalequipments.item;

import bucik689.magicalequipments.effects.EffectDefiniction;
import bucik689.magicalequipments.effects.ModEffects;
import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.Trinket;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

        public static final Trinket OBSIDIAN_SKULL = new Trinket(new Item.Settings().group(ItemGroup.MISC), "obsidian_skull", new EffectDefiniction[] {new EffectDefiniction(StatusEffects.FIRE_RESISTANCE, 20 * 2 * 1, 0,false)});
        public static final Trinket RING_OF_RESISTANCE = new Trinket(new Item.Settings().group(ItemGroup.MISC), "ring_of_resistance", new EffectDefiniction[] {new EffectDefiniction(StatusEffects.RESISTANCE, 20 * 2 * 1, 0, false)});
        public static final Material OBSIDIAN_CHUNK = new Material(new Item.Settings().group(ItemGroup.MISC), "obsidian_chunk");
        public static final Trinket FAST_CLOCK = new Trinket(new Item.Settings().group(ItemGroup.MISC), "fast_clock", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_SLOWNESS, 20 * 2 * 1, 0, false)});
        public static final Trinket BLINDFOLD = new Trinket(new Item.Settings().group(ItemGroup.MISC), "blindfold", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_BLINDNESS, 20 * 2 * 1, 0, false)});
        public static final Trinket ARMOR_BRACING = new Trinket(new Item.Settings().group(ItemGroup.MISC), "armor_bracing", new EffectDefiniction[] {});

        public static void registerModItems() {
        }
}