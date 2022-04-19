package ch.owe.drinkstreetbackend.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SellingDto {
    long productId;
    long sellerId;
    int quantity;
}
