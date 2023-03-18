package kr.megaptera.backend.weekd02.assignment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedProduct {
    private long id;
    private long orderId;
    private long productId;
    private long count;
}
