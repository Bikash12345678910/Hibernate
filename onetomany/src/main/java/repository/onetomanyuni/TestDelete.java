package repository.onetomanyuni;

import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import static repository.onetomanyuni.TestSave.em;
import static repository.onetomanyuni.TestSave.et;
// Find student with id 1
// If the student is associated Bengali book
// we need to remove the connection between the book and the student
// then we need to delete the Book records/data
public class TestDelete {
    public static void main(String[]args){
        Student student=em.find(Student.class,1);
        Book book =null;
        for(Book b: student.getBooks()){
            if(b.equals("Bengali")){
                book=b;
            }
            if(book !=null){
             student.getBooks().remove(book);
             et.begin();
             em.merge(student);
             em.remove(book);
             et.commit();
             System.out.print("successfully deleted");
            }
        }
    }

}
