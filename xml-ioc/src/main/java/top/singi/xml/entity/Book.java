package top.singi.xml.entity;

import java.time.LocalDateTime;

public class Book {
    Long id;
    String title;
    LocalDateTime createdAt;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", createdAt=" + createdAt + "]";
    }
}
