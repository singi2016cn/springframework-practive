package top.singi.annotationXmlIoc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Book {
    Long id;
    String title;
    LocalDateTime createdAt;
}
