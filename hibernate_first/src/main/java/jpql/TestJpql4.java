package jpql;

import javax.persistence.*;

public class TestJpql4 {
    public static void main(String[]args){
        String jpql="delete from Marvel m where m.budget=100000000";
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        Query query= em.createQuery(jpql);
        et.begin();
        int res= query.executeUpdate();
        et.commit();
        if(res >0){
            System.out.println("successfully dalete");
        }
        else{
            System.out.print("to records update");
        }
    }
}
