package com.example.SecondLab.models;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.example.SecondLab.models.Product;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Product> products;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

}