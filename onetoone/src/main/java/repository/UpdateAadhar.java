package repository;

import entity.Aadhar;
import entity.Person;
import jakarta.persistence.*;

public class UpdateAadhar {
    public static void main(String[]args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        Aadhar aadhar=em.find(Aadhar.class,899951794088L);
        if(aadhar!=null){
            aadhar.setAddress("Mumbai");
            em.merge(aadhar);
            System.out.println("successfully update");
        }
        et.commit();
        em.close();
        emf.close();
    }
}
