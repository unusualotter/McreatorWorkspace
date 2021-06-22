
package net.mcreator.nh.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.nh.NhModElements;

@NhModElements.ModElement.Tag
public class LeadAxeItem extends NhModElements.ModElement {
	@ObjectHolder("nh:lead_axe")
	public static final Item block = null;
	public LeadAxeItem(NhModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}.setRegistryName("lead_axe"));
	}
}
