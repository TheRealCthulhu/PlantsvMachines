package net.cameron.plants_v_machines.item;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.custom.FuelItem;
import net.cameron.plants_v_machines.item.custom.AustraliumDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlantsVMachines.MOD_ID);


    public static final RegistryObject<Item> AUSTRALIUM_INGOT = ITEMS.register("australium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AUSTRALIUM = ITEMS.register("raw_australium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AUSTRALIUM_NUGGET = ITEMS.register("australium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOLOGNA_SAUSAGE = ITEMS.register("bologna_sausage",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AUSTRALIUM_DETECTOR = ITEMS.register("australium_detector",
            () -> new AustraliumDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));
    public static final RegistryObject<Item> OLIVE = ITEMS.register("olive",
            () -> new Item(new Item.Properties().food(ModFoods.OLIVE)));
    public static final RegistryObject<Item> BOLOGNA = ITEMS.register("bologna",
            () -> new Item(new Item.Properties().food(ModFoods.BOLOGNA)));
    public static final RegistryObject<Item> SANDVICH = ITEMS.register("sandvich",
            () -> new Item(new Item.Properties().food(ModFoods.SANDVICH)));
    public static final RegistryObject<Item> SWISS_CHEESE = ITEMS.register("swiss_cheese",
            () -> new Item(new Item.Properties().food(ModFoods.SWISS_CHEESE)));

    public static final RegistryObject<Item> SMALL_MONEY = ITEMS.register("small_money",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> MEDIUM_MONEY = ITEMS.register("medium_money",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final RegistryObject<Item> LARGE_MONEY = ITEMS.register("large_money",
            () -> new FuelItem(new Item.Properties(), 1600));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
