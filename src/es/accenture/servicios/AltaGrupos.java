package es.accenture.servicios;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.accenture.entidades.Componente;
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
	
	public static void main(String[] args) {
		//Datos del nuevo grupo
		Grupo helloween = new Grupo("Helloween", 1978, "Hamburgo", "Power metal");
		AltaGrupos.altaGrupo(helloween);

		Componente voz = new Componente("Michael Kiske", "Voz");
		voz.setGrupo(helloween);
		Componente voz1 = new Componente("Andi Deris", "Voz");
		voz1.setGrupo(helloween);
		Componente guitarra = new Componente("Kai Hansen", "Guitarra");
		guitarra.setGrupo(helloween);
		Componente bateria = new Componente("Ingo Schwichtenberg", "Bateria");
		bateria.setGrupo(helloween);

		helloween.agregarComponente(voz);
		helloween.agregarComponente(voz1);
		helloween.agregarComponente(bateria);
		helloween.agregarComponente(guitarra);
		
		AltaComponenteGrupo.altaComponentesGrupo(helloween);
	}
		
}
