package emmethods;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
    public static void main(String[] args) {
        System.out.println("hello");
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("barryallen");


        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction et = entityManager.getTransaction();
        Marvel marvel = entityManager.find(Marvel.class, "EndGame");
        if (marvel != null){
            et.begin();
            entityManager.remove(marvel);
            et.commit();
            System.out.print("success");
        }
    }
}
