package me.magi.fitcore.api.controller;

import me.magi.fitcore.model.entity.ContentCreatorEntity;
import me.magi.fitcore.model.entity.UserEntity;
import me.magi.fitcore.model.services.ContentCreatorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContentCreatorController {

    private final ContentCreatorServiceImpl contentCreatorService;


    public ContentCreatorController(ContentCreatorServiceImpl contentCreatorService) {
        this.contentCreatorService = contentCreatorService;
    }

    @GetMapping("/contentCreator")
    public List<ContentCreatorEntity> GetAllUsers () {
        return contentCreatorService.listAllContentCreator();
    }

    @PostMapping("/contentCreator")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewUser(@RequestBody ContentCreatorEntity user) {
        contentCreatorService.addNewContentCreator(user);
    }


}
