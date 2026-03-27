package repository.manytooneuni;
import entity.manytooneuni.Developer;
import entity.manytooneuni.PL;

import static repository.onetomanyuni.TestSave.em;
import static repository.onetomanyuni.TestSave.et;
public class TestSave {
    public static void main(String[]args){
        // create Developer object
        Developer developer1=new Developer();
        developer1.setDevid(101);
        developer1.setName("bikash");
        developer1.setSkillRating(8);
        Developer developer2=new Developer();
        developer2.setDevid(102);
        developer2.setName("akash");
        developer2.setSkillRating(9);
        Developer developer3=new Developer();
        developer3.setDevid(103);
        developer3.setName("srabanti");
        developer3.setSkillRating(7);

        PL pl=new PL();
        pl.setPlName("java");
        pl.setDescription("HLA");
        developer1.setPl(pl);
        developer2.setPl(pl);
        developer3.setPl(pl);
        et.begin();
        em.persist(developer1);
        em.persist(developer2);
        em.persist(developer3);
        em.persist(pl);
        et.commit();
        System.out.println("successfully insert the data");
    }
}
