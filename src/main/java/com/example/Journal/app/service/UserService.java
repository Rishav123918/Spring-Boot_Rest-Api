package com.example.Journal.app.service;

import com.example.Journal.app.Repository.JournalEntryRepository;
import com.example.Journal.app.Repository.UserEntryRepository;
import com.example.Journal.app.entity.JournalEntry;
import com.example.Journal.app.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
   @Autowired
   private UserEntryRepository userEntryRepository;


   public void saveEntry(User user){
       userEntryRepository.save(user);
   }

   public List<User>getAll(){
       return userEntryRepository.findAll();
   }

   public Optional<User> findById(ObjectId id){
       return userEntryRepository.findById(id);
   }

   public void deleteById(ObjectId id){
       userEntryRepository.deleteById(id);
   }

   public User findByUserName(String userName){
       return userEntryRepository.findByUserName(userName);
   }

}
// controller call-> service call ->repository