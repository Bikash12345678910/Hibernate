
    import entity.Marvel;

    import javax.persistence.EntityManager;
    import javax.persistence.EntityManagerFactory;
    import javax.persistence.EntityTransaction;
    import javax.persistence.Persistence;

    public class App {
        public static void main(String[] args) {
            EntityManagerFactory emf =  Persistence.createEntityManagerFactory("MyPersistenceUnit");
            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
           // System.out.println(emf);
            EntityManager emx =emf.createEntityManager();
            Marvel marvel=new Marvel();
            marvel.setMovieName("EndGamess");
            marvel.setBudget(100000000);
            marvel.setRevenue(100000);
            et.begin();
            em.persist(marvel);
            et.commit();
            System.out.println("success");

        }
    }

