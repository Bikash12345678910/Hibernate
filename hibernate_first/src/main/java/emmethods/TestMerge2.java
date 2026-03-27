package emmethods;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMerge2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("barryallen");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction et = entityManager.getTransaction();
        Marvel marvel = new Marvel();
    Marvel mervel=new Marvel();
        mervel.setMovieName("GirlFriend");
        mervel.setBudget(300000);
        mervel.setRevenue(500000);
        mervel.setMovieName("");
        et.begin();
        entityManager.merge(marvel);
        et.commit();
        System.out.print("success");
    }
}
