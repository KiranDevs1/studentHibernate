package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Studentsave {
	 public static void main (String [] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kiran");
		 EntityManager entitymanager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entitymanager.getTransaction();
		 Student student= new Student();
		 student.setId(100);
		 student.setName("anjal");
		 student.setAge(23);
		 student.setGender("male");
		 student.setPhno(721319312l);
		 student.setLoc("otp");
		 
		 
		 
		 entityTransaction.begin();
		 entitymanager.persist(student);
		 entityTransaction.commit();
		 
		 
	 }

}
