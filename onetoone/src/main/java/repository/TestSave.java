package repository;

import entity.Car;
import entity.Engine;
import jakarta.persistence.*;


public class TestSave {
    static EntityManagerFactory entityManagerFactory=
            Persistence.createEntityManagerFactory("barryallen");
    static EntityManager entityManager=entityManagerFactory.createEntityManager();
    static EntityTransaction entityTransaction=entityManager.getTransaction();
    public static void main(String[]args){
        Car car=new Car(12,"HONDA",null);
      Engine engine=new Engine(111,75.0);
        car.setEngine(engine);
        entityTransaction.begin();
        entityManager.persist(car);
       //entityManager.persist(engine);
        entityTransaction.commit();
        System.out.print("success");
    }
}
