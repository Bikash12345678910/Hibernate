package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Boy {

        @Id
        private String name;
        private int RollNo;
        private int ClassNo;
        @OneToOne
        private Tutorial tutorial;


    public Boy(String akash, int i, int i1) {
    }
}


