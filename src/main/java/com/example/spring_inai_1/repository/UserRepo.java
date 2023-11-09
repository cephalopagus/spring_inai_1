package com.example.spring_inai_1.repository;

import com.example.spring_inai_1.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {

}
