package me.right.bootstudy.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookService {

    @Async
    public void saveBook(Book book){
        log.info("save book called");
    }


}
