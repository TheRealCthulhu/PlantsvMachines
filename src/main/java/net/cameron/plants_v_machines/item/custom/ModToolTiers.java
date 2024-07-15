package net.cameron.plants_v_machines.item.custom;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier AUSTRALIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1971, 9f, 4f,25, ModTags.Blocks.NEEDS_AUSTRALIUM_TOOL,
                    () -> Ingredient.of(ModItems.AUSTRALIUM_INGOT.get())),
            new ResourceLocation(PlantsVMachines.MOD_ID, "australium"), List.of(Tiers.NETHERITE), List.of());

}
