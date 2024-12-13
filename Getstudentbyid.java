package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Getstudentbyid {
	public static void main (String [] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kiran");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	 
	 Student student = entityManager.find(Student.class,100);
	  
	 System.out.println("student id is " +student.getId());
	 System.out.println("student id is " +student.getName());
	 System.out.println("student id is " +student.getAge());
	 System.out.println("student id is " +student.getPhno());
	 System.out.println("student id is " +student.getLoc());
	 
}
}
