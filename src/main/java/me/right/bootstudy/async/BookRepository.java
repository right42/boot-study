package me.right.bootstudy.async;

import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(Long bookId);
}
