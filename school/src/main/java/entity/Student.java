package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "teacher")
@Data

public class Student {
    @Id
    private String name;
    private int roll;
   private long phone;
   private double fees;
   @OneToOne
   @JoinColumn
    private Teacher teacher;


}
