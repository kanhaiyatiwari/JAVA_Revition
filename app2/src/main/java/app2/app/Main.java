package app2.app;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inserting("uday",23);
//		inserting("mahes",45);
		
//		jpql1();
//		jpql2();
//		
	}
	
	
	public static void inserting( String name,int age) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		
	 EntityManager em=emf.createEntityManager();
	 Student s=new Student();
	 s.setName(name);
	 s.setAge(age);
	 
	 em.getTransaction().begin();
	 em.persist(s);
	 em.getTransaction().commit();
	 System.out.println("done...");
	 em.close();
	}
	public static void find () {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=emf.createEntityManager();
		Student st =em.find(Student.class, 2);
		System.out.println(st);
		em.close();
	}

	
	public static void delte () {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=emf.createEntityManager();
		Student st =em.find(Student.class, 2);
		em.getTransaction().begin();
		em.remove(st);
		em.getTransaction().commit();
		System.out.println("delete d");
		em.close();
	}
	
	public static void update () {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=emf.createEntityManager();
		Student st =em.find(Student.class, 3);
		em.getTransaction().begin();
		st.setAge(st.getAge()+50);
		em.getTransaction().commit();
		System.out.println("updatet d");
		em.close();
	}
//	jpql
	public static void jpql1() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s");
		List<Student>list=q.getResultList();
		for(Student s:list) {
			System.out.println(s);
		}
	}
	
	
	
	public static void jpql2() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s.name from Student s where s.name like 'm%'");
		List<String>list=q.getResultList();
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	
}
