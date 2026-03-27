package repository.manytoonebi;
import entity.onetomanybi.Employee;
import entity.onetomanybi.Manager;

import static repository.onetomanyuni.TestSave.et;
import static repository.onetomanyuni.TestSave.em;
// We will use this class to write logics to save Employee and Manager records
public class TestSaveUsingCascade {
    public static void main(String[]args){
        Employee employee1=new Employee();
        employee1.setEmpId(103);
        employee1.setEmpName("Motu");
        Employee employee2=new Employee();
        employee2.setEmpId(104);
        employee2.setEmpName("Patlu");
        Manager manager1=new Manager();
        manager1.setMgId(2);
        manager1.setMgName("John");
        employee1.setMg(manager1);
        employee2.setMg(manager1);
        et.begin();
        em.persist(employee1);
        em.persist(employee2);
        et.commit();
        System.out.print("success");
    }
}
