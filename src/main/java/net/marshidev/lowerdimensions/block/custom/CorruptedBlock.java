package net.marshidev.lowerdimensions.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MovementType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.tick.OrderedTick;

public class CorruptedBlock extends Block {
    public CorruptedBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        new Thread() {
            public void run() {
                try {
                    int i = 0;
                    while(entity.getY() > pos.getY()) {
                        i += 10;
                        entity.setSwimming(true);
                        entity.setFrozenTicks(i);
                        entity.setPos(pos.getX(), entity.getY() - 0.1f, pos.getZ());
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
    }
}
