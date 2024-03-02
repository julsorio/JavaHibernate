package es.accenture.servicios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Grupo;
import es.accenture.util.Util;

public class AltaGrupos {

	public static Grupo altaGrupo(Grupo grupo) {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(grupo);
		transaction.commit();

		System.out.println("Se ha dado de alta el grupo " + grupo.getNombre() + " con Id " + grupo.getGrupoId());
		
		return grupo;
	}
}
