package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person(null, "Carlos", "carlos@gmail.com");
        Person p2 = new Person(null, "Maria", "maria@gmail.com");
        Person p3 = new Person(null, "Bob", "bob@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //META-INF/persistence.xml
        EntityManager em = emf.createEntityManager(); // conexão do banco de dados

//        em.getTransaction().begin(); //OBRIGATORIO PARA INTERACOES SEM SER LEITURA, abre a transaction
//        em.persist(p1); //pega o obj e salva no banco de dados
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit(); //fecha a transaction
//        System.out.println("INSERTED!");

        Person p = em.find(Person.class, 2); //busca por id

        em.getTransaction().begin();
        em.remove(p); //VAI DAR ERRO se for com Person p = new Person(2, null, null);
        //precisa ser
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
