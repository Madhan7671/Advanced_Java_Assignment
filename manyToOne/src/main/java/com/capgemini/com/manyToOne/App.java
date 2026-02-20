package com.capgemini.com.manyToOne;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
        
        EntityManager em=emf.createEntityManager();
        try {
        	em.getTransaction().begin();
        	Department dept=new Department("cse");
        	
        	Student st1=new Student(null,"qwer",dept);
        	Student st2=new Student(null,"asaf",dept);
        	dept.setStudents(Arrays.asList(st1,st2));
        	em.persist(dept);
        	em.getTransaction().commit();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	em.getTransaction().rollback();
        }
        finally{
        	em.close();
        	emf.close();
        }
    }
}
