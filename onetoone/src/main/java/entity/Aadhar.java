package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
import jakarta.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aadhar {
    @Id
    private long aadhar;
    private String address;
    @OneToOne(mappedBy="aadhar")

    private Person person;

}
