package repository;

import entity.Car;
import entity.Engine;

// In this program we will write logic to find the Car
// After  fetching the Car object, we will get the engin object from the car
public class TestFind {
    public static void main(String[]args){
        Car c=TestSave.entityManager.find(Car.class,1);
        if(c!=null){
            Engine engin=c.getEngine();
            System.out.print(engin);
        }
    }
}
