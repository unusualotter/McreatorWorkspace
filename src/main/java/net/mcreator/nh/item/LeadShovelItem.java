
package net.mcreator.nh.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.nh.NhModElements;

@NhModElements.ModElement.Tag
public class LeadShovelItem extends NhModElements.ModElement {
	@ObjectHolder("nh:lead_shovel")
	public static final Item block = null;
	public LeadShovelItem(NhModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LeadIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lead_shovel"));
	}
}
