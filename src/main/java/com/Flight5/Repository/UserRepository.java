package com.Flight5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight5.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailID);


}
