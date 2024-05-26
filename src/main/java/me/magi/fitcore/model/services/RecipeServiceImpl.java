package me.magi.fitcore.model.services;

import me.magi.fitcore.model.entity.RecipeEntity;
import me.magi.fitcore.model.repository.RecipeRepository;
import me.magi.fitcore.model.services.servicesinterface.RecipeService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addNewRecipe(RecipeEntity recipe, MultipartFile image) throws IOException {
        // Verifica se a imagem não é nula e possui dados
        if (image != null && !image.isEmpty()) {
            // Converte a imagem para um array de bytes
            byte[] imageData = image.getBytes();
            // Define os dados da imagem na entidade
            recipe.setImage(imageData);
        }
        // Salva a entidade no banco de dados
        repository.save(recipe);
    }

    @Override
    public void removeRecipe(Long id) {
        // Implemente a lógica para remover uma receita pelo ID
    }

    @Override
    public RecipeEntity readRecipe(Long id) {
        // Implemente a lógica para ler uma receita pelo ID
        return null;
    }

    @Override
    public List<RecipeEntity> listAllRecipe() {
        return (List<RecipeEntity>) repository.findAll();
    }

    @Override
    public RecipeEntity updateRecipeById(Long id, RecipeEntity recipe) {
        // Implemente a lógica para atualizar uma receita pelo ID
        return recipe;
    }
}
