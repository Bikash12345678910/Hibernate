package entity.manytooneuni;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PL {
    @Id
    private String plName;
    private String description;

}
