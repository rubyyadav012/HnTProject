package com.hnt.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnt.orderService.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
