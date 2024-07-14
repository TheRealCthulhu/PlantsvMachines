package net.cameron.plants_v_machines.datagen;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.ModBlocks;
import net.cameron.plants_v_machines.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PlantsVMachines.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.AUSTRALIUM_DETECTOR_VALUABLES)
                .add(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get(),
                        ModBlocks.AUSTRALIUM_BLOCK.get(),
                        ModBlocks.AUSTRALIUM_DIFFUSER.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                ;
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                ;
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get(),
                        ModBlocks.AUSTRALIUM_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                ;
    }
}
