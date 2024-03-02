package es.accenture.servicios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Componente;
import es.accenture.entidades.Grupo;
import es.accenture.util.Util;

public class AltaComponenteGrupo {

	public static void altaComponentesGrupo(Grupo grupo) {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		
		for(Componente componente : grupo.getComponentes()) {
			System.out.printf("Se da de alta %s en el grupo %s a la %s %n", componente.getNombre(), grupo.getNombre(), componente.getInstrumento());
		}
		
		session.saveOrUpdate(grupo);
		
		transaction.commit();
	}
}
