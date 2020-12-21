package me.right.bootstudy.rest;

import lombok.RequiredArgsConstructor;
import me.right.bootstudy.async.Book;
import me.right.bootstudy.async.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @GetMapping("/")
    public Collection<Book> findBooks(){
        return bookRepository.getBooks();
    }

}
