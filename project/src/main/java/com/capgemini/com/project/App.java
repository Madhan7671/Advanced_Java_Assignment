package com.capgemini.com.project;

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
        em.getTransaction().begin();
        
        Account account=new Account("Acc12345","savings");
        Customer customer=new Customer("John Doe", account);
        
        account.setCustomer(customer);
        
        em.persist(customer);
        
        em.getTransaction().commit();
        System.out.println("Customer and Account saved successufully");
        
    }
}
