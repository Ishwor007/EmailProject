package com.practise.emailproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.emailproject.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
