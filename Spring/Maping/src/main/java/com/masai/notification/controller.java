package com.masai.notification;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();

	    Notitfication n1=new Notitfication();
	    n1.setNname("you have to join meet at 5pm");
	    
	    Notitfication n2=new Notitfication();
	    n2.setNname("please join the meet !");
	    
	    Notitfication n3=new Notitfication();
	    n3.setNname("thank you for joing us!");
	    
	    User u1=new User();
	    u1.setUname("kanhaiya");
	    
	    User u2=new User();
	    u2.setUname("udaay");
	    
	    User u3=new User();
	    u2.setUname("ram");
	    
	    User u4=new User();
	    u4.setUname("rahul");
	    
	   Set<Notitfication> ns1=new HashSet<>();
	   ns1.add(n1);
	   ns1.add(n2);
	   Set<Notitfication> ns2=new HashSet<>();
	   ns2.add(n1);
	   ns2.add(n3);
	   Set<Notitfication> ns3=new HashSet<>();
	   ns1.add(n3);
	
	   
	   Set<User> us1=new HashSet<>();
	   us1.add(u1);
	   us1.add(u2);
	   
	   Set<User> us2=new HashSet<>();
	   us2.add(u1);
	   us2.add(u3);
	   us2.add(u4);
	   
	   u1.setNotification(ns1);
	   n1.setUser(us1);
	   
	   u2.setNotification(ns2);
	   n2.setUser(us2);
	   
	   em.persist(u1);
	   em.persist(u2);
	   em.getTransaction().commit();
	   System.out.println("done");
	   em.close();
	    
	    
	}
	
	
	

}
