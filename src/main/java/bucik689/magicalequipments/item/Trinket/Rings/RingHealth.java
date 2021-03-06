package bucik689.magicalequipments.item.Trinket.Rings;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class RingHealth extends TrinketBase {

    private static final UUID HEALTH_UUID = UUID.fromString("b0baf145-e9ab-4d24-8da1-614dc5b76167");
    private final int healthAmount;

    public RingHealth(String name, Rarrity rarrity, SlotType slotType, int healthAmount) {
        super(name, rarrity, slotType);
        this.healthAmount = healthAmount;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = HashMultimap.create();

        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH,
                new EntityAttributeModifier(HEALTH_UUID, "Max Health", healthAmount,
                        EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }

}