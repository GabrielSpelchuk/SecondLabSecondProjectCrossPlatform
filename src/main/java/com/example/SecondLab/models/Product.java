package com.example.SecondLab.models;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Store getStore() {
        return store;
    }

}