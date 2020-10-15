package com.jeanpandolfi.ratingservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rating {
    private Long id;
    private Long bookId;
    private int stars;
}
