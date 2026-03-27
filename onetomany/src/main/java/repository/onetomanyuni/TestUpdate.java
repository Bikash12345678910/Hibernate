package repository.onetomanyuni;

import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import static repository.onetomanyuni.TestSave.em;
import static repository.onetomanyuni.TestSave.et;

public class TestUpdate {
    public static void main(String[] args) {
        Student student=em.find(Student.class,1);
        for(Book book: student.getBooks()){
            if(book.getBookName().equals("Science"));
            book.setBookName("Maths");
            et.begin();
            em.merge(book);
            et.commit();
            break;
        }
    }
}
