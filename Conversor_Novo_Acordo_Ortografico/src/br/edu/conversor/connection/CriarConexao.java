package br.edu.conversor.connection;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author Luis
 */

public class CriarConexao {


    public static Session getSession() {   
    	return new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    }
}