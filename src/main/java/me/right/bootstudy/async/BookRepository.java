package me.right.bootstudy.async;

import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(Long bookId);
}
