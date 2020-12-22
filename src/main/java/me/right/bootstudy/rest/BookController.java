package me.right.bootstudy.rest;

import lombok.RequiredArgsConstructor;
import me.right.bootstudy.rest.domain.Book;
import me.right.bootstudy.rest.domain.BookRepository;
import me.right.bootstudy.rest.exception.BookNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookRepository.findById(id)
                .orElseThrow(BookNotFoundException::new);
    }

    @GetMapping("/")
    public Collection<Book> findBooks(){
        return bookRepository.findAll();
    }


    @GetMapping("/filter")
    public Page<Book> filterBooks(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}
