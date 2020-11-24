package me.right.bootstudy.mvc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.right.bootstudy.async.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @PostMapping("/books")
    public Result books(@RequestBody Book book){
        return new Result("success");
    }


    @PostMapping("/test")
    public Result test(Book book) {
        return new Result("success");
    }

    @Getter
    @RequiredArgsConstructor
    private static class Result {
        private final String body;
    }
}
