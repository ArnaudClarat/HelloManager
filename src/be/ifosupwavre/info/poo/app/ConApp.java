package be.ifosupwavre.info.poo.app;

import be.ifosupwavre.info.poo.pojo.Recipe;

public class ConApp {
    public static void main(String[] args) {
        var recipes = new Recipe[2];
        for (int i = 0; i < recipes.length; i++) {
                recipes[i] = new Recipe("Omelette");
        }

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getTitle());
        }
    }
}
