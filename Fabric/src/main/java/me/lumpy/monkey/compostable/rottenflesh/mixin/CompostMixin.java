package me.lumpy.monkey.compostable.rottenflesh.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ComposterBlock.class)
public class CompostMixin extends Block {
	public CompostMixin(Settings settings) {
		super(settings);
	}

	@Invoker
	private static void invokeRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item)    {
        throw new NotImplementedException("The invoke failed.");
    }
	

	@Inject(at = @At("HEAD"), method = "registerDefaultCompostableItems()V")
	private static void injectRegisterDefaultCompostableItems(CallbackInfo info) {
		CompostMixin.invokeRegisterCompostableItem(0.3f, Items.ROTTEN_FLESH);
	}

}
