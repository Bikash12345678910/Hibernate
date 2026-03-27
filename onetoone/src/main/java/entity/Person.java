package entity;

import jakarta.persistence.*;
import lombok.*;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;


@Entity
@Data
@Getter
@Setter
@ToString(exclude = "aadhar")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private int id;
    private String name;
    private int age;
    @OneToOne
    @JoinColumn
    private Aadhar aadhar;
}
