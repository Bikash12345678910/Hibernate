package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    private int carId;
    private String brand;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Engine engine;
}
