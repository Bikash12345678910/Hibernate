package emmethods;


import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind {
    public static void main(String[] args) {
        //  Create EntityManagerFactory object using
        //  persistence class static method  CreateEntityManagerFactory()
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
        EntityManager em=emf.createEntityManager();
//        Marvel movie=
//em.find(new Marvel().getClass(),"EndGame");
        Marvel marvel = em.find(Marvel.class, "EndGames");
        System.out.print(marvel);


    }
}
