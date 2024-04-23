package me.magi.fitcore.model.repository;

import me.magi.fitcore.model.entity.UserEntity;
import me.magi.fitcore.model.entity.entityimpl.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findUserByEmail(String email);
}
