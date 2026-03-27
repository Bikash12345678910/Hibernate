package entity.onetomanybi;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = "employees")
@EqualsAndHashCode
public class Manager {
    @Id
    private int mgId;
    private String mgName;
    @OneToMany(mappedBy = "mg")

    private List<Employee> employees;
    public void addEmployee(Employee ... newemployees){
        if(employees==null){
            employees=new ArrayList<>();
        }
        for(Employee e:newemployees){
            employees.add(e);
        }
    }
}
