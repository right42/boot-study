package me.right.bootstudy.async;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DefaultBookRepository implements BookRepository {

    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }
}
