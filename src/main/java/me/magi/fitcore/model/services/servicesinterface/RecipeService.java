package me.magi.fitcore.model.services.servicesinterface;

import me.magi.fitcore.model.entity.RecipeEntity;
import me.magi.fitcore.model.entity.UserEntity;

public interface RecipeService {

    public void addNewRecipe(RecipeEntity recipe);

    public void removeRecipe(Long id);

    public UserEntity readRecipe(Long id);

    public Iterable<RecipeEntity> listAllRecipe();

    public RecipeEntity updateRecipeById(Long id, RecipeEntity recipe);

}
