package repository.onetomanyuni;
import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import java.util.List;

import static repository.onetomanyuni.TestSave.em;
import static repository.onetomanyuni.TestSave.et;

public class TestFetch {
    public static void main(String[]args){
        Student student=em.find(Student.class,1);
        List<Book>tempBooks=student.getBooks();
        student.setBooks(null);
        et.begin();
        em.merge(student);
        et.commit();

//        List<Book>tempBooks=books;
//        books=null;
        System.out.print(tempBooks);
        System.out.println(student.getBooks());
    }
}
