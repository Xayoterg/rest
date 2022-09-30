package com.example.rest.repository;

import com.example.rest.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Integer> {
UserEntity findByLogin(String login);
}
