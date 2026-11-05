package com.redgrin.listener;

import com.redgrin.listener.entity.RedgrinListenerEntity;
import com.redgrin.listener.entity.BloodshotEyeballEntity;
import com.redgrin.listener.item.StakeItem;
import com.redgrin.listener.item.StunTrapItem;
import com.redgrin.listener.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedgrinListenerMod implements ModInitializer {
    public static final String MOD_ID = "redgrinlistener";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Entity Types
    public static final EntityType<RedgrinListenerEntity> REDGRIN_LISTENER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "redgrin_listener"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RedgrinListenerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.2f, 5.4f)) // ~3x player height, hunched
                    .trackRangeBlocks(80)
                    .trackedUpdateRate(3)
                    .build()
    );

    public static final EntityType<BloodshotEyeballEntity> BLOODSHOT_EYEBALL = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "bloodshot_eyeball"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BloodshotEyeballEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.4f))
                    .trackRangeBlocks(64)
                    .build()
    );

    // Items
    public static final Item STAKE = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "stake"),
            new StakeItem(new Item.Settings().maxCount(1))
    );

    public static final Item STUN_TRAP = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "stun_trap"),
            new StunTrapItem(new Item.Settings().maxCount(1))
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Redgrin Listener mod initializing...");

        // Register entity attributes
        FabricDefaultAttributeRegistry.register(REDGRIN_LISTENER, RedgrinListenerEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(BLOODSHOT_EYEBALL, BloodshotEyeballEntity.createAttributes());

        // Register sounds
        ModSounds.register();

        // Register events (spawn trigger, etc.)
        com.redgrin.listener.event.ModEvents.register();

        LOGGER.info("Redgrin Listener is now listening...");
    }
}
