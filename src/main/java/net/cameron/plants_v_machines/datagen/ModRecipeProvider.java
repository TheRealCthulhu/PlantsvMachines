package net.cameron.plants_v_machines.datagen;

import net.cameron.plants_v_machines.PlantsVMachines;
import net.cameron.plants_v_machines.block.ModBlocks;
import net.cameron.plants_v_machines.item.custom.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> AUSTRALIUM_SMELTABLES = List.of(ModItems.RAW_AUSTRALIUM.get(),
            ModBlocks.DEEPSLATE_AUSTRALIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, AUSTRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AUSTRALIUM_NUGGET.get(), 0.25f, 100, "australium");
        oreSmelting(pWriter, AUSTRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AUSTRALIUM_NUGGET.get(), 0.25f, 200, "australium");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AUSTRALIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.AUSTRALIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.AUSTRALIUM_INGOT.get()), has(ModItems.AUSTRALIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AUSTRALIUM_INGOT.get(), 9)
                .requires(ModBlocks.AUSTRALIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AUSTRALIUM_BLOCK.get()), has(ModBlocks.AUSTRALIUM_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, PlantsVMachines.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
