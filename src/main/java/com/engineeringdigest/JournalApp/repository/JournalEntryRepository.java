package com.engineeringdigest.JournalApp.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.engineeringdigest.JournalApp.entity.JournalEntry;
import org.bson.types.ObjectId; 

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
