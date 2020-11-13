package me.right.bootstudy.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class BookService {

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

}
