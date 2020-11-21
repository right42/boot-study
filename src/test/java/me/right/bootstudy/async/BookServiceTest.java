package me.right.bootstudy.async;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {BookService.class})
@ExtendWith(SpringExtension.class)
class BookServiceTest {

    @MockBean
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @Test
    void findById(){
        when(bookRepository.findById(1L))
                .thenReturn(
                    Optional.of(Book.builder()
                            .id(1L)
                            .title("testBook")
                            .writer("writer")
                            .build())
                );

        Book book = bookService.findById(1L);

        assertThat(book).isNotNull();
        assertThat(book.getId()).isEqualTo(1L);
        assertThat(book.getTitle()).isEqualTo("testBook");
        assertThat(book.getWriter()).isEqualTo("writer");
    }

    @Test
    void findByIdWithBDD(){
        given(bookRepository.findById(1L))
                .willReturn(
                        Optional.of(Book.builder()
                            .id(1L)
                            .title("testBook")
                            .writer("writer")
                            .build())
                );

        Book book = bookService.findById(1L);

        assertThat(book).isNotNull();
        assertThat(book.getTitle()).isEqualTo("testBook");
    }

}