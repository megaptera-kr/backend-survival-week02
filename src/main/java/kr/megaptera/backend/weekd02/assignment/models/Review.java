package kr.megaptera.backend.weekd02.assignment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private long id;
    private long productId;
    private String userId;
    private String content;
}
