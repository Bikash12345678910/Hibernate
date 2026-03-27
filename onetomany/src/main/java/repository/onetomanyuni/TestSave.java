package repository.onetomanyuni;

import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TestSave {
    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("barryallen");
    public static EntityManager em=emf.createEntityManager();
    public static EntityTransaction et=em.getTransaction();
    public static void main(String[]args){
        Student student=new Student();
        student.setRollNo(4);
        student.setSname("Prabitra");
        // Create one list of type book
        List<Book>books=new ArrayList<>();
        // create book objects
        Book book1=new Book();
        book1.setBookId(105);
        book1.setBookName("Science");
        Book book2=new Book();
        book2.setBookId(104);
        book2.setBookName("Bengali");
        //Book will add those book objects to list
        books.add(book1);
        books.add(book2);
        student.setBooks(books);
        et.begin();
        // since we are using cascadetype persist
        // explicitly no necessary to persist the non owning entities

//        em.persist(book1);
//        em.persist(book2);
        em.persist(student);
        et.commit();
        System.out.println("success");
    }
}
