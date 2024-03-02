package es.accenture.servicios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Grupo;
import es.accenture.util.Util;

public class ConsultaGrupos {

	public static List<Grupo> obtenerListaGrupos() {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		List<Grupo> listaGrupos = session.createQuery("SELECT o FROM Grupo o", Grupo.class).list();
		transaction.commit();
		
		return listaGrupos;
	}
}
