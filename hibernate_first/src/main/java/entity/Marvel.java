package entity;

import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Marvel {
    @Id
    private String movieName;
    private double budget;
    private double revenue;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setBudget(double budget) {
        //setter for validation
        if(budget >= 100000)
            this.budget = budget;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
