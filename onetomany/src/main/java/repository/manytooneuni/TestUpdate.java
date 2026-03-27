package repository.manytooneuni;

import entity.manytooneuni.Developer;
import entity.manytooneuni.PL;
import entity.onetomanyuni.Book;
import entity.onetomanyuni.Student;

import javax.persistence.Query;

import static repository.onetomanyuni.TestSave.em;
import static repository.onetomanyuni.TestSave.et;

public class TestUpdate {
    public static void main(String[]args){
        String jpql="update Developer d set d.pl=:newpl where d.name=:name";
        Query query=em.createQuery(jpql);
        query.setParameter("name","bikash");
        PL pl=new PL();
        pl.setPlName("python");
        pl.setDescription("HLPL");
        query.setParameter("newpl",pl);
        et.begin();
        em.persist(pl);
        et.commit();
        et.begin();
        query.executeUpdate();
        et.commit();
        System.out.print("successfully updated");
    }
    }

