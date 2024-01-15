package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;




@Entity
public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", authors=" + authors +
                '}';
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    @Id
    String book_id;
    String book_name;

    @ManyToOne
    private Author authors;
    public Book(){

    }

    public Book(String book_id, String book_name) {
        this.book_id = book_id;
        this.book_name = book_name;
    }
}
