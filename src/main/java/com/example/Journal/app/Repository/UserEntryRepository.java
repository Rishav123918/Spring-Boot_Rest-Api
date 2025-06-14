package com.example.Journal.app.Repository;

import com.example.Journal.app.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepository extends MongoRepository<User, ObjectId> {
User findByUserName(String userName);

}
