package repository.manytooneuni;


import entity.manytooneuni.Developer;
import entity.manytooneuni.PL;

import javax.persistence.*;
import java.util.List;

public class TestDelete {
    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
    public static EntityManager em=emf.createEntityManager();
    public static EntityTransaction et=em.getTransaction();
    public static void main(String[]args){
        String jpql="Select d from Developer d where d.pl='python'";
        List<Developer>developers=em.createQuery(jpql).getResultList();

        PL pl=null;
        if(developers.size() !=0){
            pl=developers.get(0).getPl();
        }
        et.begin();
        for(Developer d:developers)
        {
            d.setPl(null);
            em.merge(d);
//            pl=d.getPl();
        }
        em.remove(pl);
        et.commit();
        System.out.println("success");
    }
}
