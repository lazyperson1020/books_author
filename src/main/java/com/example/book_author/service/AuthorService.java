package com.example.book_author.service;



import com.example.book_author.entity.Author;
import com.example.book_author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }
    
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
}