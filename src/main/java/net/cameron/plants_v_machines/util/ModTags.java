package net.cameron.plants_v_machines.util;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> AUSTRALIUM_DETECTOR_VALUABLES = tag("australium_detector_valuables");
        public static final TagKey<Block> NEEDS_AUSTRALIUM_TOOL = tag("needs_australium_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PlantsVMachines.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PlantsVMachines.MOD_ID, name));
        }
    }
}
