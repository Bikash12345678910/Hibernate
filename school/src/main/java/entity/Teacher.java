package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    private String TeacherName;
    private String course;
    @OneToOne(mappedBy = "teacher")
   private Student student;
}
