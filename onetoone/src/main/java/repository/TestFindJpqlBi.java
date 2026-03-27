package repository;

import entity.Aadhar;

//import javax.persistence.Query;
import jakarta.persistence.*;

import static repository.TestSave.entityManager;

public class TestFindJpqlBi {
    public static void main(String[]args){
//        String jpql="select a from Aadhar  a join a.person p where p.name:username";
        String jpql="select a from Aadhar a where a.person.name:username";

        Query query=entityManager.createQuery(jpql);

        query.setParameter("username","Bikash");
        Aadhar aadhar=(Aadhar) query.getSingleResult();
        System.out.println(aadhar);


    }
}
