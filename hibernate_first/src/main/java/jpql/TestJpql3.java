package jpql;

import javax.persistence.*;

public class TestJpql3 {
    public static void main(String[]args){
        String jpql="update Marvel n set m.revenue=3000000 where m.budget=100000000";
        EntityManagerFactory entityManagerFactory=
                Persistence.createEntityManagerFactory("barryallen");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        et.begin();
        Query query=entityManager.createQuery(jpql);
        int res= query.executeUpdate();
         et.commit();
//        System.out.print("hiii");
//
        if(res >0){
            System.out.println("successfully update");
        }
        else{
            System.out.print("to records update");
        }
    }
}
