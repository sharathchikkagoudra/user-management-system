package com.palle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.palle.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
