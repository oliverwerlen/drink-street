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
public class EventDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    long id;
    String name;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    String identifier;
}
