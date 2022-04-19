package ch.owe.drinkstreetbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    long id;
    String name;
    private double basicPrice;
}
