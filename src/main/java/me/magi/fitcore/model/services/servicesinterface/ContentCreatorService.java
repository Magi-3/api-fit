package me.magi.fitcore.model.services.servicesinterface;

import me.magi.fitcore.model.entity.ContentCreatorEntity;
import me.magi.fitcore.model.entity.UserEntity;

import java.util.List;

public interface ContentCreatorService {

    public void addNewContentCreator(ContentCreatorEntity contentCreator);

    public void removeContentCreator(String id);

    public UserEntity readContentCreator(String id);

    public List<UserEntity> listAllContentCreator();

    public void updateContentCreatorById(String id, ContentCreatorEntity contentCreator);
}
