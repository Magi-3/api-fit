package me.magi.fitcore.model.services.servicesinterface;

import me.magi.fitcore.model.entity.RecipeEntity;

public interface RecipeService {

    public void createNewRecipe(RecipeEntity recipe);

    public void deleteRecipe();
}
