package kr.megaptera.backend.weekd02.assignment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AddCartRequest {
    private long productId;
    private long count;
}
