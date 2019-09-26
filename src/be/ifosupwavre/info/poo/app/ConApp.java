package be.ifosupwavre.info.poo.app;

import be.ifosupwavre.info.poo.pojo.Recipe;
import be.ifosupwavre.info.poo.pojo.RecipeManager;

public class ConApp {
    public static void main(String[] args) {
        RecipeManager recipeManager = new RecipeManager();

        recipeManager.addRecipe(new Recipe("Burger"));
        recipeManager.addRecipe(new Recipe("Omelette"));
        recipeManager.addRecipe(new Recipe("Steak"));

        System.out.println(recipeManager.filterByTitle("Burger"));
    }
}
