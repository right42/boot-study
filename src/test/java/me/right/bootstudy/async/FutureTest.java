package me.right.bootstudy.async;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.assertj.core.api.Assertions.*;

public class FutureTest {

    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    @Test
    void futureTest() throws Exception {
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " execute");
        });

        Future<Long> submit = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " submit");
            return 1L;
        });

        Long l = submit.get();
        assertThat(l).isEqualTo(1L);
    }

    @Test
    void completableFutureTest() throws Exception {
        CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " runAsync");
        });

        CompletableFuture<Long> longCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " runAsync");
            return 1L;
        }, executorService);

    }
}
