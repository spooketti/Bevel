package spooketti.qol.mixin;

import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FlintAndSteelItem.class)
public class furanceflin {
    /*
FurnaceBlock
    @Inject(at = @At("HEAD"), method = "useOnBlock")
    private void lightFurance(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
      BlockPos pos = context.getBlockPos();
      World world = context.getWorld();
      if(world.getBlockEntity(pos) instanceof FurnaceBlockEntity furnace)
      {
          System.out.println(furnace.getAvailableSlots(Direction.DOWN));
      }
    }
    */
}