package com.engineeringdigest.JournalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.engineeringdigest.JournalApp.entity.User;    
import org.bson.types.ObjectId;



public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String userName);
}
