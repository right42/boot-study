package me.right.bootstudy.async;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AsyncTest {

    @Autowired
    BookService bookService;

    @Test
    void saveBook(){
        Book book = Book.builder()
                        .title("test")
                        .writer("writer")
                        .build();

        bookService.saveBook(book);
    }

}