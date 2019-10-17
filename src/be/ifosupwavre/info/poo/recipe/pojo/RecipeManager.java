package be.ifosupwavre.info.poo.recipe.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RecipeManager {
    private Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe args) {
        recipes.add(args);
    }

    public boolean containsRecipe(Recipe args) {
        return recipes.contains(args);
    }

    public boolean removeRecipe(Recipe args) {
        if (containsRecipe(args)) {
            return recipes.remove(args);
        }
        else {
            return false;
        }
    }

    public boolean updateRecipe(Recipe args1, Recipe args2) {
        if (containsRecipe(args1)) {
            removeRecipe(args1);
            addRecipe(args2);
            return true;
        }
        else {
            return false;
        }
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public Set<Recipe> filter(String title, Category category, Difficulty difficulty, int time, int expDay, List<Ingredient> ingredients) {
        Predicate<Recipe> predicate = null;
        Predicate<Recipe> temp = null;
        if (title != null) {
            predicate = recipe -> recipe.getTitle().contains(title) || recipe.getSubtitle().contains(title);
        }
        if (category != null) {
            temp = recipe -> recipe.getCategory().equals(category);
            if (predicate == null) {
                predicate = temp;
            } else {
                predicate = predicate.and(temp);
            }
        }
        if (difficulty != null) {
            temp = recipe -> recipe.getDifficulty().equals(difficulty);
            if (predicate == null) {
                predicate = temp;
            } else {
                predicate = predicate.and(temp);
            }
        }
        if (time != 0) {
            temp = recipe -> recipe.getTime() == time;
            if (predicate == null) {
                predicate = temp;
            } else {
                predicate = predicate.and(temp);
            }
        }
        if (expDay != 0) {
            temp = recipe -> recipe.getExpDay() == expDay;
            if (predicate == null) {
                predicate = temp;
            } else {
                predicate = predicate.and(temp);
            }
        }
        if (ingredients != null) {
            for (Ingredient ingredient:ingredients) {
                temp = recipe -> recipe.getIngredients().contains(ingredient);
            }
            if (predicate == null) {
                predicate = temp;
            } else {
                predicate = predicate.and(temp);
            }
        }
        return recipes.parallelStream().filter(predicate).collect(Collectors.toSet());
    }
}
