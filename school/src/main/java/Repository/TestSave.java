package Repository;

import entity.Boy;
import entity.Teacher;
import entity.Tutorial;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("Mypersistence");
    static EntityManager em=emf.createEntityManager();
    static EntityTransaction et=em.getTransaction();
    public static void main(String[]args){
            Boy boy=new Boy("Akash",12,12);
            Tutorial  tutorial=new Tutorial("Tanmoy","CSE");
            boy.setTutorial(tutorial);
            et.begin();
            em.persist(boy);
            em.persist(tutorial);
            et.commit();
            System.out.print("successfully save the records");

        }
    }

