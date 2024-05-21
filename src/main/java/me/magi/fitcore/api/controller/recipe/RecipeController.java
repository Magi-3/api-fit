package me.magi.fitcore.api.controller.recipe;

import me.magi.fitcore.model.services.RecipeServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RecipeController {

    private final RecipeServiceImpl recipeService;


    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }


}
