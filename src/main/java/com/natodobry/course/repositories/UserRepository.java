package com.natodobry.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natodobry.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
