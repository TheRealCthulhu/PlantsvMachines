package net.cameron.plants_v_machines.datagen;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PlantsVMachines.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AUSTRALIUM_INGOT);
        simpleItem(ModItems.RAW_AUSTRALIUM);
        simpleItem(ModItems.AUSTRALIUM_NUGGET);
        simpleItem(ModItems.BOLOGNA);
        simpleItem(ModItems.BOLOGNA_SAUSAGE);
        simpleItem(ModItems.SANDVICH);
        simpleItem(ModItems.SMALL_MONEY);
        simpleItem(ModItems.SWISS_CHEESE);
        simpleItem(ModItems.AUSTRALIUM_DETECTOR);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.OLIVE);
        simpleItem(ModItems.MEDIUM_MONEY);
        simpleItem(ModItems.LARGE_MONEY);
        simpleItem(ModItems.LETTUCE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PlantsVMachines.MOD_ID, "item/" + item.getId().getPath()));
    }
}
