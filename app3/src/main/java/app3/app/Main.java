package app3.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		
		 EntityManager em=emf.createEntityManager();
		 
		 Pen p=new Pen();
		 p.setColor("blusd");
		 p.setName("seleo");
		 p.setProductId(1);
		 
		 em.getTransaction().begin();
		 em.persist(p);
		 em.getTransaction().commit();
		 em.close();
	}
	

	

}
