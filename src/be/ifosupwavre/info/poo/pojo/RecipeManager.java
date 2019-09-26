package be.ifosupwavre.info.poo.pojo;

import java.sql.Time;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RecipeManager {
    /*
            Set recipe

            addRecipe()
            removeRecipe()
            updateRecipe()
            containsRecipe()
            getRecipes()
            filterByTags()
            filterByTitle()
            filterBy...
             */
    private Set<Recipe> recipes = new HashSet<>();
    public Set<Recipe> selection = new HashSet<>();

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

    public Set<Recipe> filterByTags(String tag, Category category, Difficulty difficulty, int time) {
        if (!tag.isEmpty()) {
            var tags = tag.split(" ");
            for (var t : tags) {
                // TODO Changer "Objects..nonNull"
                selection.addAll(recipes.parallelStream().filter(Objects::nonNull).collect(Collectors.toSet()));
            }
        }
        return selection;
    }

    public Set<Recipe> filterByTitle(String title) {
        for (Recipe recipe : getRecipes()) {
            // TODO Changer "Objects..nonNull"
            selection.addAll(recipes.parallelStream().filter(Objects::nonNull).collect(Collectors.toSet()));
        }
        return selection;
    }
}
