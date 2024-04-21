package me.magi.fitcore.model.services.servicesinterface;

import me.magi.fitcore.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    public void addNewUser(UserEntity military);

    public void removeUser(Long id);

    public UserEntity readUser(Long id);
    
    public List<UserEntity> listAllUser();

    public void updateUserById(Long id, UserEntity userRequestDto);
}
