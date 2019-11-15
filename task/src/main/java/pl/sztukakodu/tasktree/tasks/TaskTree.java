package pl.sztukakodu.tasktree.tasks;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TaskTree implements Serializable {


    private String title;
    private String author;
    private LocalDateTime date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TaskTree{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }



}
