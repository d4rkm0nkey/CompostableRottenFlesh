package me.lumpy.monkey.compostable.rottenflesh;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

public class CompostableRottenFlesh implements ModInitializer {
	@Override
	public void onInitialize() {
		// Same chance as the "low" vanilla compostables (e.g. grass, seeds)
		DefaultItemComponentEvents.MODIFY.register(context -> context.modify(Items.ROTTEN_FLESH,
				builder -> builder.set(DataComponents.COMPOSTABLE, new Compostable(ContextIntProviders.COMPOSTABLE_LOW))));
	}
}
