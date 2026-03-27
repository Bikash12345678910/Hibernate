package Repository;

import entity.Student;
import entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
   static EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("pre");
    public static void main(String[]args){
        System.out.print("success1");
        System.out.print("success1");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        Student student=new Student("Bikash",10,8710059145l,35,null);
        Teacher teacher=new Teacher("chandan","CSE",null);
        student.setTeacher(teacher);
        et.begin();
        em.persist(student);
        et.commit();
        System.out.print("success");
    }
}
