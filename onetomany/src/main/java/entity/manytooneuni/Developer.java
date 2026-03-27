package entity.manytooneuni;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Developer {
    public void setPl(PL pl) {
        this.pl = pl;
    }

    @Id
    private int devid;
    private String name;
    @ManyToOne
    private PL pl;

    public void setSkillRating(int skillRating) {
        if(skillRating>1 && skillRating<11)
         this.skillRating = skillRating;
    }

    private int skillRating;

    public void setDevid(int devid) {
        if(devid>100 && devid<1000)
         this.devid = devid;
    }

    public void setName(String name) {

            this.name = name;
    }
}
