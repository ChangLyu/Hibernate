package com.hibernate;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args){
		Student student= new Student();
		student.setName("Chang");
		
     //   Student_Info studentInformation=new Student_Info();
        //studentInformation.setStudent_mobile_number("188345345");
       // studentInformation.setStudent(student1);
		student.setRollNo(1);
		//student.1setBirthDate(new Date());
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		//insert into a new student1
		//session.save(student);
		
		//get a student from the databse
	  //  student=(Student)session.get(Student.class, 1);
	    //System.out.println("Student Object have student name as:"+student.getName());
		
	    student.setName("Chang_update");
	    session.update(student);
	    
	    //session.delete(student);
	    
	    session.getTransaction().commit();
		session.close();
		//sessionFactory.close();
	
	}

}
