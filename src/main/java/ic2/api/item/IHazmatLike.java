package ic2.api.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.EntityEquipmentSlot.Type;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import ic2.api.info.Info;

/**
 * Mark an {@link ItemArmor} as acting like part of a hazmat suit
 *
 * <p>Note that a full hazmat suit will protect the wearing {@link EntityLivingBase} from
 * 	<ul>
 * 		<li>Fire ({@link DamageSource#IN_FIRE})
 * 		<li>Burning ({@link DamageSource#ON_FIRE})
 * 		<li>Suffocation ({@link DamageSource#IN_WALL})
 * 		<li>Lava ({@link DamageSource#LAVA})
 * 		<li>Magma ({@link DamageSource#HOT_FLOOR})
 * 		<li>Electrocution ({@link Info#DMG_ELECTRIC})
 * 		<li>Radiation ({@link Info#DMG_RADIATION})
	</ul>
 *
 * @author Chocohead
 */
public interface IHazmatLike {
	/**
	 * Whether this is a valid part of a hazmat suit
	 *
	 * @param entity The entity wearing the armour
	 * @param slot The slot the armour is in
	 * @param stack The armour stack being worn
	 *
	 * @return Whether this will protect the given entity if it is wearing other hazmat like armour
	 */
	boolean addsProtection(EntityLivingBase entity, EntityEquipmentSlot slot, ItemStack stack);

	/**
	 * Whether this alone acts as a full hazmat suit, use sparingly
	 *
	 * @param entity The entity wearing the armour
	 * @param slot The slot the armour is in
	 * @param stack The armour stack being worn
	 *
	 * @return Whether this will fully protect the given entity as if it was wearing a full hazmat suit
	 */
	default boolean fullyProtects(EntityLivingBase entity, EntityEquipmentSlot slot, ItemStack stack) {
		return false;
	}

	/**
	 * Test whether the given entity is wearing a full hazmat suit
	 *
	 * @param living The entity to test
	 *
	 * @return Whether the entity has a complete hazmat suit, as defined by the two methods above
	 *
	 * @throws NullPointerException If entity is null
	 */
	static boolean hasCompleteHazmat(EntityLivingBase living) {
		for (EntityEquipmentSlot slot : EntityEquipmentSlot.values()) {
			if (slot.getSlotType() != Type.ARMOR) continue;
			ItemStack stack = living.getItemStackFromSlot(slot);

			if (stack == null || !(stack.getItem() instanceof IHazmatLike)) {
				return false;
			}

			IHazmatLike hazmat = (IHazmatLike) stack.getItem();
			if (!hazmat.addsProtection(living, slot, stack)) return false;
			if (hazmat.fullyProtects(living, slot, stack)) return true;
		}

		return true;
	}
}