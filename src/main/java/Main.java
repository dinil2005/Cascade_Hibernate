import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import utill.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        Book book1 = new Book();

        List<Book> bookList = new ArrayList<>();

        Author author2 = new Author();
        Book book2 = new Book();

        author1.setAuthor_Id("A001");
        author1.setAuthor_name("Nimal");
        author1.setBooks(bookList);

        book1.setBook_id("B001");
        book1.setBook_name("Palu Dupatha");
        book1.setAuthors(author2);

        author2.setAuthor_Id("A002");
        author2.setAuthor_name("Kamla");
        author2.setBooks(bookList);

        book2.setBook_id("B002");
        book2.setBook_name("Diwa rayak");
        book2.setAuthors(author1);


        bookList.add(book1);
        bookList.add(book2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        session.persist(author1);
//        session.persist(author2);
        session.remove(author2);
        // session.persist(book1);
      //  session.persist(book2);


        transaction.commit();
        session.close();


    }
}
