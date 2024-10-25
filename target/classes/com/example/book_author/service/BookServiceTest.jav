package com.example.book_author.service;

import com.example.book_author.entity.Book;
import com.example.book_author.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    
    @InjectMocks
    private BookService bookService;
    
    @Test
    void getAllBooks_ShouldReturnAllBooks() {
        // Arrange
        List<Book> expectedBooks = Arrays.asList(new Book(), new Book());
        when(bookRepository.findAllWithAuthors()).thenReturn(expectedBooks);
        
        // Act
        List