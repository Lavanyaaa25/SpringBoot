package com.example.demo.entity;

//POJO

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document( collection = "journal_entries")//row
@Data
//equivalent to
//@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode @Builder
public class JournalEntry {
    @Id //key
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

}
