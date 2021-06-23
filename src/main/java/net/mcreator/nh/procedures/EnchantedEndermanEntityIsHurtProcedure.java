package net.mcreator.nh.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.nh.NhModElements;
import net.mcreator.nh.NhMod;

import java.util.Map;

@NhModElements.ModElement.Tag
public class EnchantedEndermanEntityIsHurtProcedure extends NhModElements.ModElement {
	public EnchantedEndermanEntityIsHurtProcedure(NhModElements instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NhMod.LOGGER.warn("Failed to load dependency entity for procedure EnchantedEndermanEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon  minecraft:enderman ~ ~ ~");
			}
		}
	}
}
