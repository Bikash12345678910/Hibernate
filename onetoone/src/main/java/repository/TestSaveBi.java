package repository;

import entity.Aadhar;
import entity.Person;
//import jdk.internal.loader.BuiltinClassLoader;

import static repository.TestSave.entityManager;
import static repository.TestSave.entityTransaction;
public class TestSaveBi {
//     static BuiltinClassLoader.NullModuleReader entityManager;

    public static void main(String[]args){
        Person person=new Person();
        person.setId(101);
        person.setAge(23);
        person.setName("Bikash");
        Aadhar aadhar=new Aadhar();
        aadhar.setAadhar(899951794088l);
        aadhar.setAddress("West Bengal");
        // we need to set the connection between person and aadhar objects
        person.setAadhar(aadhar);
        aadhar.setPerson(person);
        entityTransaction.begin();
        entityManager.persist(aadhar);
        entityManager.persist(person);
        entityTransaction.commit();
        System.out.print("success");
    }
}
