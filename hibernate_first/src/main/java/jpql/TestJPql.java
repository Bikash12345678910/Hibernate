package jpql;

import entity.Marvel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestJPql {
    public static void main(String[]args){
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("MyPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // sqlo - select * from student
        // jpql - select student  from student student
        // select  s from Student s;
        String jpql="select m from Marvel m";
        Query query=entityManager.createQuery(jpql);
        List<Marvel> marvels=query.getResultList();
        for(Marvel m:marvels){
            System.out.println(m);
        }
    }
}
