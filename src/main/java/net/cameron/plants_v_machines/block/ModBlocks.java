package net.cameron.plants_v_machines.block;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.custom.AustraliumDiffuserBlock;
import net.cameron.plants_v_machines.item.custom.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlantsVMachines.MOD_ID);

    public static final RegistryObject<Block> AUSTRALIUM_BLOCK = registerBlock("australium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> DEEPSLATE_AUSTRALIUM_ORE = registerBlock("deepslate_australium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    public static final RegistryObject<Block> AUSTRALIUM_DIFFUSER = registerBlock("australium_diffuser",
            () -> new AustraliumDiffuserBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
