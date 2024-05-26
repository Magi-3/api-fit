package me.magi.fitcore.api.controller.recipe;

import me.magi.fitcore.model.entity.RecipeEntity;
import me.magi.fitcore.model.services.RecipeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RecipeController {

    private final RecipeServiceImpl service;

    public RecipeController(RecipeServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/recipe")
    public List<RecipeEntity> GetAllRecipe() {
        return service.listAllRecipe();
    }

    @PostMapping("/recipe")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewRecipe(@RequestParam("image") MultipartFile image,
                             @RequestParam("title") String title,
                             @RequestParam("bodyText") String bodyText,
                             @RequestParam("registerDay") String registerDay,
                             @RequestParam("ownerId") Long ownerId,
                             @RequestParam("calories") String calories,
                             @RequestParam("ingredients") List<String> ingredients) throws IOException {
        RecipeEntity recipe = new RecipeEntity();
        recipe.setTitle(title);
        recipe.setBodyText(bodyText);
        // Convertendo a data de registro para o formato adequado antes de definir
        // recipe.setRegisterDay(registerDayConverted);
        // recipe.setCalories(calories);
        recipe.setIngredients(ingredients);

        // Salvando a receita com a imagem
        service.addNewRecipe(recipe, image);
    }

    @GetMapping("/recipe/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RecipeEntity findRecipeById(@PathVariable Long id) {
        return service.readRecipe(id);
    }

    @DeleteMapping("/recipe/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void DeleteRecipe(@PathVariable Long id) {
        service.removeRecipe(id);
    }

    @PatchMapping("/recipe/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RecipeEntity UpdateRecipe(@PathVariable Long id, @RequestBody RecipeEntity recipe) {
        return service.updateRecipeById(id, recipe);
    }
}
