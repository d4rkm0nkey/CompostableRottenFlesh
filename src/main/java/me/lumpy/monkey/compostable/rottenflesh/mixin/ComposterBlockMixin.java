package me.lumpy.monkey.compostable.rottenflesh.mixin;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ComposterBlock.class)
public class ComposterBlockMixin {
	@Inject(at = @At("TAIL"), method = "bootStrap()V")
	private static void registerRottenFlesh(CallbackInfo info) {
		// Same chance as the "low" vanilla compostables (e.g. grass, seeds)
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.3F);
	}
}
