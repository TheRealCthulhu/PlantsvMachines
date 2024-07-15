package net.cameron.plants_v_machines.item.custom;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlantsVMachines.MOD_ID);


    public static final RegistryObject<CreativeModeTab> PVM_TAB = CREATIVE_MODE_TABS.register("pvm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AUSTRALIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.pvm_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_AUSTRALIUM.get());
                        pOutput.accept(ModItems.AUSTRALIUM_INGOT.get());
                        pOutput.accept(ModItems.AUSTRALIUM_NUGGET.get());
                        pOutput.accept(ModItems.BOLOGNA_SAUSAGE.get());

                        pOutput.accept(ModItems.AUSTRALIUM_DETECTOR.get());

                        pOutput.accept(ModBlocks.AUSTRALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get());

                        pOutput.accept(ModBlocks.AUSTRALIUM_DIFFUSER.get());

                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.OLIVE.get());
                        pOutput.accept(ModItems.LETTUCE.get());
                        pOutput.accept(ModItems.SANDVICH.get());
                        pOutput.accept(ModItems.SWISS_CHEESE.get());
                        pOutput.accept(ModItems.BOLOGNA.get());

                        pOutput.accept(ModItems.SMALL_MONEY.get());
                        pOutput.accept(ModItems.MEDIUM_MONEY.get());
                        pOutput.accept(ModItems.LARGE_MONEY.get());

                        pOutput.accept(ModItems.FRYING_PAN.get());
                        pOutput.accept(ModItems.AUSTRALIUM_SHOVEL.get());
                        pOutput.accept(ModItems.AUSTRALIUM_AXE.get());
                        pOutput.accept(ModItems.AUSTRALIUM_PICKAXE.get());
                        pOutput.accept(ModItems.AUSTRALIUM_SWORD.get());
                        pOutput.accept(ModItems.AUSTRALIUM_HOE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
