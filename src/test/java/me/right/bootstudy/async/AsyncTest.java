package me.right.bootstudy.async;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AsyncTest {

    @Autowired
    BookService bookService;

    @Test
    void saveBook() throws ExecutionException, InterruptedException {
        Book book = Book.builder()
                        .id(1L)
                        .title("test")
                        .writer("writer")
                        .build();

        CompletableFuture<Long> longCompletableFuture = bookService.saveBook(book);
        Long bookId = longCompletableFuture.get();

        assertThat(bookId).isEqualTo(1L);
    }

}