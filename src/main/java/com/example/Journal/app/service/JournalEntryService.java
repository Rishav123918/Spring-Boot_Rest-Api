package com.example.Journal.app.service;

import com.example.Journal.app.Repository.JournalEntryRepository;
import com.example.Journal.app.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
   @Autowired
   private JournalEntryRepository journalEntryRepository;


   public void saveEntry(JournalEntry journalEntry){
       journalEntryRepository.save(journalEntry);
   }

   public List<JournalEntry>getAll(){
       return journalEntryRepository.findAll();
   }

   public Optional<JournalEntry> findById(ObjectId id){
       return journalEntryRepository.findById(id);
   }

   public void deleteById(ObjectId id){
     journalEntryRepository.deleteById(id);
   }

}
// controller call-> service call ->repository