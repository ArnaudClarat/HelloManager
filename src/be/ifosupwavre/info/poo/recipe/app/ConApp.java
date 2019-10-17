package be.ifosupwavre.info.poo.recipe.app;

import be.ifosupwavre.info.poo.recipe.pojo.Category;
import be.ifosupwavre.info.poo.recipe.pojo.Recipe;
import be.ifosupwavre.info.poo.recipe.pojo.RecipeManager;

class ConApp {
    public static void main(String[] args) {
        RecipeManager recipeManager = new RecipeManager();

        recipeManager.addRecipe(new Recipe("Burger", "Hamburger"));
        recipeManager.addRecipe(new Recipe("Omelette", "Omelette nature"));
        recipeManager.addRecipe(new Recipe("Steak", "Steak de boeuf 200g"));
        recipeManager.addRecipe(new Recipe("Machin", "Bidule"));

        var rec1 = new Recipe.Builder()
                .putSubTitle("Bidule")
                .putTitle("Machin")
                .putCategory(Category.MEAT)
                .build();
        recipeManager.addRecipe(rec1);

        System.out.println(recipeManager.filter("Machin",null,null,0,0,null));
    }
}
