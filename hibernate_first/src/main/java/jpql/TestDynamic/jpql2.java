package jpql.TestDynamic;

import javax.persistence.*;

public class jpql2 {
    public static void main(String[]args){
        String jpql="update Marvel m set m.revenue=?1 where m.budget=?2";
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        Query query= em.createQuery(jpql);
        query.setParameter("1",900000000.0);
        query.setParameter("2",0.0);
        et.begin();
        int res=query.executeUpdate();
        et.commit();
        if(res>0){
            System.out.print("successfully update");
        }
        else{
            System.out.print("not update");
        }
    }
}
