package es.accenture.principal;

import java.util.ArrayList;
import java.util.List;

import es.accenture.entidades.Componente;
import es.accenture.entidades.Grupo;
import es.accenture.servicios.AltaComponenteGrupo;
import es.accenture.servicios.AltaGrupos;
import es.accenture.servicios.BajaGrupo;
import es.accenture.servicios.ConsultaGrupos;

public class Operaciones {

	public static void main(String[] args) {
		List<Grupo> listaGrupos = ConsultaGrupos.obtenerListaGrupos();
		for (Grupo grupo : listaGrupos) {
			System.out.println(grupo.toString());
		}

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
		
		BajaGrupo.bajaGrupo(helloween);
	}

}
