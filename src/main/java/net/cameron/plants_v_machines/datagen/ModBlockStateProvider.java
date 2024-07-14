package net.cameron.plants_v_machines.datagen;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PlantsVMachines.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AUSTRALIUM_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE);

        blockWithItem(ModBlocks.AUSTRALIUM_DIFFUSER);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
