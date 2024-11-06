package spooketti.qol.mixin;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.village.VillagerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VillagerEntity.class)
public abstract class VillagerFollowMixin {
/*
    @Inject(at = @At("RETURN"), method = "initGoals()V", cancellable = true)

    private void followPlayerEmerald(CallbackInfo ci) {
        this.goalSelector.add();
    }
    private void attackBirdsAI(CallbackInfo info) {
        this.goalSelector.add(3, new MeleeAttackGoal((OcelotEntity) (Object) this, 0.7D, true));
        this.targetSelector.add(2, new FollowTargetGoal((OcelotEntity) (Object) this, BirdEntity.class, true));
    }
 */
}