package entity.onetomanybi;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString(exclude = "mg")
@EqualsAndHashCode
public class Employee {
    @Id
    private int empId;
    private String empName;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Manager mg;
}
