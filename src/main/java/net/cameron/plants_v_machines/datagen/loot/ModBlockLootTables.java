package net.cameron.plants_v_machines.datagen.loot;

import net.cameron.plants_v_machines.block.ModBlocks;
import net.cameron.plants_v_machines.item.custom.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AUSTRALIUM_BLOCK.get());
        this.dropSelf(ModBlocks.AUSTRALIUM_DIFFUSER.get());

        this.add(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get(), ModItems.RAW_AUSTRALIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
