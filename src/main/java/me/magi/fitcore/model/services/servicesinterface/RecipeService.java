package me.magi.fitcore.model.services.servicesinterface;

import me.magi.fitcore.model.entity.RecipeEntity;
import me.magi.fitcore.model.entity.UserEntity;
import org.springframework.web.multipart.MultipartFile;

public interface RecipeService {

    public void addNewRecipe(RecipeEntity recipe);

    public void removeRecipe(Long id);

    public RecipeEntity readRecipe(Long id);

    public Iterable<RecipeEntity> listAllRecipe();

    public RecipeEntity updateRecipeById(Long id, RecipeEntity recipe);

}
