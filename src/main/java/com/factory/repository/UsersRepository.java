package com.factory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.factory.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
	
	Users findByUserName(@Param("userName") String userName);

}
