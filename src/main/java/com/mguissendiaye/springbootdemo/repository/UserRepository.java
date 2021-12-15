package com.mguissendiaye.springbootdemo.repository;

import com.mguissendiaye.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
