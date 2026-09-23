package com.engineeringdigest.JournalApp.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;
import com.mongodb.lang.NonNull;

@Document(collection = "journal_entries")
@Data 
@NoArgsConstructor 
public class JournalEntry {
    
    @Id 
    private ObjectId id;
    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;
    

}
