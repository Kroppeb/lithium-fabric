package me.jellysquid.mods.lithium.mixin.alloc.empty_streams;

import me.jellysquid.mods.lithium.common.util.streams.EmptyStream;
import net.minecraft.entity.Entity;
import net.minecraft.util.shape.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.stream.Stream;

@Mixin(Entity.class)
public class EntityMixin {

    @Redirect(method = "adjustMovementForCollisions(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;",
            at = @At(value = "INVOKE", target = "Ljava/util/stream/Stream;empty()Ljava/util/stream/Stream;"))
    private static Stream<VoxelShape> reuseEmptyStream() {
        //noinspection unchecked
        return (Stream<VoxelShape>) EmptyStream.INSTANCE;
    }
}
