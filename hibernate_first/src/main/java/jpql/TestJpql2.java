package jpql;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJpql2 {
    public static void main(String[]args){
        String jpql="select m from Marvel m where m.budget=20000";
        EntityManagerFactory entityManagerFactory=
                Persistence.createEntityManagerFactory("barryallen");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        Query query=entityManager.createQuery(jpql);
        Marvel marvel=(Marvel) query.getSingleResult();
        System.out.println(marvel);
    }
}
