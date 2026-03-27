package jpql;

import javax.persistence.*;

public class TestDynamicJpl {
    public static void main(String[]args){
        String jpql="update Marvel m set m.revenue:newrevenue where m.budget:newbudget";
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        Query query= em.createQuery(jpql);
        query.setParameter("newrevenue",900000000.0);
        query.setParameter("newbudget",0.0);
        et.begin();
        int res=query.executeUpdate();
        et.commit();
        if(res >0){
            System.out.println("successfully update");
        }
        else{
            System.out.print("to records update");
        }

    }
}
