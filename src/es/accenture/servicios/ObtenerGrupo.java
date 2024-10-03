package es.accenture.servicios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Grupo;
import es.accenture.util.Util;

public class ObtenerGrupo {

	
	public static Grupo obtener() {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		Grupo grupo = session.find(Grupo.class, 11);
		transaction.commit();	
		
		return grupo;
	}
}
