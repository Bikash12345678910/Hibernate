package repository;

import entity.Car;
import entity.Engine;

import static repository.TestSave.entityManager;
import static repository.TestSave.entityTransaction;

public class TestDelete {
    public static void main(String[]args){
        Car car=entityManager.find(Car.class,2);
        Engine engine=car.getEngine();
        entityTransaction.begin();
        car.setEngine(null);
        entityManager.merge(car);
        entityManager.remove(engine);
        entityTransaction.commit();
        System.out.print("success");

    }
}
