package be.ifosupwavre.info.poo.app;

import be.ifosupwavre.info.poo.pojo.Recipe;
import be.ifosupwavre.info.poo.pojo.RecipeManager;

public class ConApp {
    public static void main(String[] args) {
        RecipeManager recipeManager = new RecipeManager();

        recipeManager.addRecipe(new Recipe("Burger"));
        recipeManager.addRecipe(new Recipe("Omelette"));
        recipeManager.addRecipe(new Recipe("Steak"));

        var rec1 = new Recipe.Builder()
                .putSubTitle("Bidule")
                .putTitle("Machin")
                .putTime(15)
                .build();
        recipeManager.addRecipe(rec1);

        System.out.println(recipeManager.filterByTitle("Machin"));
    }
}
