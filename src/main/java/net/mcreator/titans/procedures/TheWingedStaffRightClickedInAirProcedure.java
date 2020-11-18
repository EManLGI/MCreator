package net.mcreator.titans.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.titans.TitansModElements;

import java.util.Map;

@TitansModElements.ModElement.Tag
public class TheWingedStaffRightClickedInAirProcedure extends TitansModElements.ModElement {
	public TheWingedStaffRightClickedInAirProcedure(TitansModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TheWingedStaffRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1, (false), (false)));
	}
}
