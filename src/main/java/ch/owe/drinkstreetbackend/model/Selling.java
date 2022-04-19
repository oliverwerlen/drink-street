package ch.owe.drinkstreetbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "selling", schema = "drinkstreet")
public class Selling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long productId;
    private long sellerId;
    private long eventId;
}
