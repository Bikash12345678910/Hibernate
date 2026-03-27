package repository.manytoonebi;

import entity.manytooneuni.PL;
import entity.onetomanybi.Employee;
import entity.onetomanybi.Manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
    public static EntityManager em=emf.createEntityManager();
    public static EntityTransaction et=em.getTransaction();
    public static void main(String[]args){
        Employee employee1=new Employee();
        employee1.setEmpId(105);
        employee1.setEmpName("Sankar");
        Employee employee2=new Employee();
        employee2.setEmpId(106);
        employee2.setEmpName("Sabita");
        Employee employee3=new Employee();
        employee3.setEmpId(107);
        employee3.setEmpName("Moumita");
        Employee employee4=new Employee();
        employee4.setEmpId(108);
        employee4.setEmpName("RAJ");
        Manager manager1=new Manager();
        manager1.setMgId(204);
        manager1.setMgName("Ketu");
        employee1.setMg(manager1);
       employee2.setMg(manager1);
       employee3.setMg(manager1);
       employee4.setMg(manager1);
        et.begin();
        em.persist(employee1);
        em.persist(employee2);
        em.persist(employee3);
        em.persist(employee4);
        em.persist(manager1);
        et.commit();
        System.out.println("successfully insert the data");
    }
}
