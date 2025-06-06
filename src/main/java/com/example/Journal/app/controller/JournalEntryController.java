package com.example.Journal.app.controller;

import com.example.Journal.app.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Journal")
public class JournalEntryController {
private Map<Long, JournalEntry>journalentry=new HashMap<>();

@GetMapping
public List<JournalEntry>getAll(){
    return new ArrayList<>(journalentry.values());
}
@PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
     journalentry.put(myEntry.getId(),myEntry);
     return true;
}



    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntry(@PathVariable Long myId) {
        return journalentry.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntry(@PathVariable Long myId) {
        return journalentry.remove(myId);
    }

    @PutMapping("/id/{id}")
    public  JournalEntry updateJournalById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
     return journalentry.put(id,myEntry);
    }

}
