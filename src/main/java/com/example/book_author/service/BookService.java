package com.example.book_author.service;



import com.example.book_author.entity.Book;
import com.example.book_author.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAllWithAuthors();
    }
    
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}