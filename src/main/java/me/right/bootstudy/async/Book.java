package me.right.bootstudy.async;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @Builder
@RequiredArgsConstructor
public class Book {

    private final String title;

    private final String writer;
}
