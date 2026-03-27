package repository.onetomanyuni;

import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import static repository.onetomanyuni.TestSave.em;

public class TestFind {
    public static void main(String []args){
       Student student =em.find(Student.class,1);
        System.out.print(student);
        if(student!=null) {
            for (Book b : student.getBooks()) {
                System.out.println(b);
            }
        }
        else {
            System.out.println("Invalid student id");
        }
    }
}
