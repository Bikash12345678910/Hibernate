package repository;




import jakarta.persistence.Query;

import static repository.TestSave.entityManager;
import static repository.TestSave.entityTransaction;
public class TestJpqlUpdate {
    public static void main(String[]args){
        String jpql="update Aadhar a set a.address=:newaadhar where a.person.name=:personname";
//        String jpql = "update Aadhar a set a.address = :newaadhar " +
//                "where a.person.id = (select p.id from Person p where p.name = :personname)";

        Query query=entityManager.createQuery(jpql);
        query.setParameter("newaadhar","London");
        query.setParameter("personname","Bikash");
        entityTransaction.begin();
        query.executeUpdate();
        entityTransaction.commit();
        entityManager.clear();
        System.out.print("successfully update ");
    }
}
