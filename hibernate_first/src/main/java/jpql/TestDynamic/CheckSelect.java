package jpql.TestDynamic;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CheckSelect {
    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
    static EntityManager em=emf.createEntityManager();
    static EntityTransaction et=em.getTransaction();

    static EntityManagerFactory emf1= Persistence.createEntityManagerFactory("barryallen");
    static EntityManager em1=emf1.createEntityManager();
    static EntityTransaction et1=em1.getTransaction();
    public static void main(String[]args){
        Marvel marvel=em.find(Marvel.class,"EndGame");
        Marvel car1=em1.find(Marvel.class,"EndGame");
//       Car car1=em.find(Car.class,1);
        et.begin();
        em.persist(marvel);
        em.persist(car1);
        et.commit();
    }
}
