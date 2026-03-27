package repository;
import jakarta.persistence.*;
import entity.Aadhar;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;


public class FetchAadhar {
    public static void main(String[]args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
        EntityManager em=emf.createEntityManager();
        Aadhar aadhar=em.find(Aadhar.class,899951794088l);
        if(aadhar!=null){
            System.out.print("name :"+aadhar.getPerson());
        }
        else{
            System.out.print("Record not found");
        }
        em.close();
        emf.close();
    }
    ///  Assignment of update and delete operation in 09/12/2025
}
