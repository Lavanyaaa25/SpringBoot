package com.example.demo.repository;

import com.example.demo.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoConnectionDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
//does CRUD operations

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
    //objectId =key
}
