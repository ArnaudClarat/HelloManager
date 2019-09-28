package be.ifosupwavre.info.poo.app;

import be.ifosupwavre.info.poo.pojo.Ingredient;
import be.ifosupwavre.info.poo.pojo.Recipe;
import be.ifosupwavre.info.poo.pojo.RecipeManager;

import java.util.HashSet;
import java.util.Set;

import static be.ifosupwavre.info.poo.pojo.Category.MEAT;
import static be.ifosupwavre.info.poo.pojo.Difficulty.EASY;

public class ConApp {
    public static void main(String[] args) {
        RecipeManager recipeManager = new RecipeManager();

        Set<Ingredient> ingredients = new HashSet<>();


        Ingredient ingredient = new Ingredient();
        ingredient.setName("Pain Hamburger");
        ingredient.setQty(1);
        ingredients.add(ingredient);
        ingredient.setName("Viande Hamburger");
        ingredient.setQty(0.2f);
        ingredients.add(ingredient);
        ingredient.setName("Sauce Hamburger");
        ingredient.setQty(1);
        ingredients.add(ingredient);


        recipeManager.addRecipe(new Recipe("Burger", "Hamburger", MEAT, EASY, 30, 10,ingredients));
/*
        recipeManager.addRecipe(new Recipe("Omelette"));
        recipeManager.addRecipe(new Recipe("Steak"));
*/

        System.out.println(recipeManager.filterByTitle("Burger"));
    }
}
