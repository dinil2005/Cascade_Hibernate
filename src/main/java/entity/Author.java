package entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
public class Author {


    public Author(List<Book> books) {
        this.books = books;
    }

    public String getAuthor_Id() {
        return author_Id;
    }

    public void setAuthor_Id(String author_Id) {
        this.author_Id = author_Id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Id
    String author_Id;
    String author_name;

    @OneToMany (mappedBy = "authors",cascade = CascadeType.REMOVE,orphanRemoval =true)//
   private List<Book> books;
    public Author(){

    }

    public Author(String author_Id, String author_name) {
        this.author_Id = author_Id;
        this.author_name = author_name;
    }
}
