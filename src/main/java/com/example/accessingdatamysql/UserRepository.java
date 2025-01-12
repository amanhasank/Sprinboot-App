package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//public class UserRepository {
//
//}

public interface  UserRepository extends CrudRepository<User, Integer>{

        void deleteByName(String name);

        List<User> findUserByName(String name);

        User findByName(String name);
}
