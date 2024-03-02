package es.accenture.servicios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Componente;
import es.accenture.entidades.Grupo;
import es.accenture.util.Util;

public class BajaGrupo {

	public static void bajaGrupo(Grupo grupo) {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.printf("Se dara de baja el grupo %s con sus componentes %n", grupo.getNombre());
		for(Componente componente : grupo.getComponentes()) {
			System.out.printf("%s a la %s %n", componente.getNombre(), componente.getInstrumento());
		}
		
		session.remove(grupo);
		
		transaction.commit();
	}
}
