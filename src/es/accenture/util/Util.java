package es.accenture.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Util {
	private static Session session;
	
	public static Session getSession() {
		if(session == null) {
			session = new Configuration().configure("hibernate.cfg.xml").addPackage("es.accenture.entidades").buildSessionFactory().openSession();
		}
		
		return session;
	}
}
