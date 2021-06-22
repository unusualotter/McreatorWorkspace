
package net.mcreator.nh.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.nh.NhModElements;

@NhModElements.ModElement.Tag
public class LeadHoeItem extends NhModElements.ModElement {
	@ObjectHolder("nh:lead_hoe")
	public static final Item block = null;
	public LeadHoeItem(NhModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lead_hoe"));
	}
}
