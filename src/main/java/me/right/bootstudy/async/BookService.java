package me.right.bootstudy.async;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @Async
    public CompletableFuture<Long> saveBook(Book book){
        log.info("save book called");
        return CompletableFuture.completedFuture(book.getId());
    }

    @Async
    public void printBook(){
        log.info("{} : book1", Thread.currentThread().getName());
        log.info("{} : book2", Thread.currentThread().getName());
    }

    public Book findById(Long id) {
        Optional<Book> book = bookRepository.findById(id);

        return book.orElseThrow(() -> new IllegalArgumentException("Not found Book id : " + id));
    }

}
