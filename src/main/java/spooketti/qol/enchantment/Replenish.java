package spooketti.qol.enchantment;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.Block;

public record Replenish() implements EnchantmentEntityEffect {

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        BlockState state = world.getBlockState(new BlockPos((int)pos.x, (int)pos.y, (int)pos.z));
        Block block = state.getBlock();
//        switch(block.getName().getString())
//        {
//            case
//        }
        System.out.println(block.getName().getString());

    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return null;
    }
}
