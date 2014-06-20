package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {

		{

			System.out.println(" ***** ArrayList ***** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");
			//List<Persona> personas = new ArrayList<>();
			List<Persona> personas = new ArrayList<Persona>();
			personas.add(persona1);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona2);

			// Collections.sort(personas);

			Collections.sort(personas, new SortPersona());
			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}

		{
			System.out.println(" ***** Vector **** ");

			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");

			List<Persona> personas = new Vector<Persona>();
			personas.add(persona4);
			personas.add(persona2);
			personas.add(persona1);
			personas.add(persona3);

			// Collections.sort(personas);

			Collections.sort(personas, new SortPersona());

			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}
		{
			System.out.println(" ***** LinkedArrayList **** ");

			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");

			List<Persona> personas = new LinkedList<Persona>();
			personas.add(persona1);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona2);

			// Collections.sort(personas);
			// Collections.sort(personas, new SortPersona());

			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}

		{

			// Unsorted y unordered(no es clasificada y no es ordenada)
			// utiliza el hashcode y el equals al momneto de insertar un objeto
			// a la coleccion
			// no admite repetidos según los metodos equals y hashcode y los
			// ordena

			// si hashcode y equals no están implementados EL ORDEN ES
			// IMPREDECIBLE

			System.out.println(" ***** HahSet **** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");
			Persona persona5 = new Persona(4L, "Luis");

			Set<Persona> personas = new HashSet<Persona>();
			personas.add(persona1);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona2);
			personas.add(persona5);

			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}

		{

			// Unsorted y unordered(no es clasificada y no es ordenada)
			// mantiene el orden en que los elementos fueron insertados

			System.out.println(" ***** LinkedHahSet **** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");
			Persona persona5 = new Persona(4L, "Luis");

			Set<Persona> personas = new LinkedHashSet<Persona>();

			personas.add(persona1);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona2);
			personas.add(persona5);

			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}

		{

			// Unsorted y unordered(no es clasificada y no es ordenada)
			// mantiene el orden en que los elementos fueron insertados

			System.out.println(" ***** TreeSet **** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");
			Persona persona5 = new Persona(4L, "Luis");

			Set<Persona> personas = new TreeSet<Persona>( new SortPersona());

			personas.add(persona1);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona2);
			personas.add(persona5);

			for (Persona persona : personas) {
				System.out.println("persona : " + persona);
			}

		}

		

	}



}


