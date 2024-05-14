package me.magi.fitcore.model.services;

import me.magi.fitcore.model.entity.RecipeEntity;
import me.magi.fitcore.model.repository.RecipeRepository;
import me.magi.fitcore.model.repository.UserRepository;
import me.magi.fitcore.model.services.servicesinterface.RecipeService;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }


    @Override
    public void createNewRecipe(RecipeEntity recipe) {
        repository.save(recipe);
    }

    @Override
    public void deleteRecipe() {

    }
}
