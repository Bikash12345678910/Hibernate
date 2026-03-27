package entity.onetomanyuni;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    private int rollNo;
    private String sname;
    @OneToMany
            (fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Book>books;
    public void addBooks(Book ... newbooks){
        if(books==null)books=new ArrayList<>();
        for(Book book:newbooks) {
            books.add(book);
        }
    }
}
