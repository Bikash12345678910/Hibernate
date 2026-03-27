package emmethods;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
    public static void main(String[] args) {
        // Create EntityManagerFactory object - to establish connection
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("barryallen");
        // create EntityManager object - to perform CRUD Operations
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        // Create Transaction
        EntityTransaction et = entityManager.getTransaction();
        Marvel marvel = entityManager.find(Marvel.class, "EndGame");
        if (marvel != null) {
            marvel.setBudget(200000);
        }

    }
}
