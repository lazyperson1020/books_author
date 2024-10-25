package com.example.book_author.config;



import com.example.book_author.entity.Author;
import com.example.book_author.entity.Book;
import com.example.book_author.repository.AuthorRepository;
import com.example.book_author.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private AuthorRepository authorRepository;
    
    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public void run(String... args) {
        // Sample data initialization
        Author author1 = new Author();
        author1.setName("J.K. Rowling");
        author1.setEmail("jk.rowling@example.com");
        author1.setCountry("United Kingdom");
        authorRepository.save(author1);

        Author author2 = new Author();
        author2.setName("George R.R. Martin");
        author2.setEmail("grrm@example.com");
        author2.setCountry("United States");
        authorRepository.save(author2);
        
        Book book1 = new Book();
        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setIsbn("9780747532699");
        book1.setPublicationYear(1997);
        book1.setPrice(new BigDecimal("29.99"));
        book1.setGenre("Fantasy");
        book1.setAuthor(author1);
        bookRepository.save(book1);
        
        Book book2 = new Book();
        book2.setTitle("A Game of Thrones");
        book2.setIsbn("9780553103540");
        book2.setPublicationYear(1996);
        book2.setPrice(new BigDecimal("24.99"));
        book2.setGenre("Fantasy");
        book2.setAuthor(author2);
        bookRepository.save(book2);
        
        // Add more sample data...
    }
}
