package repository;

import entity.Car;
import entity.Engine;
import static  repository.TestSave.entityTransaction;
import static repository.TestSave.entityManager;
public class TestUpdate {
    public static void main(String[]args){
        Car car=TestSave.entityManager.find(Car.class,2);
        Engine engine=new Engine(106,90);
        car.setEngine(engine);
        TestSave.entityTransaction.begin();
        TestSave.entityManager.merge(car);
        TestSave.entityManager.persist(engine);
        TestSave.entityTransaction.commit();


    }
}
