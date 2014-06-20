package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	
	
	public static void main(String[] args) {
		
		{

			System.out.println("  **************** HashMap  ******************");

			Persona persona1 = new Persona(1L, "Roger");
			Persona persona2 = new Persona(2L, "Juan");
			Persona persona3 = new Persona(3L, "Giovana");
			Persona persona4 = new Persona(4L, "Pedro");
			HashMap<Integer, Persona> personas = new HashMap<Integer, Persona>();

			personas.put(3, persona3);
			personas.put(4, persona4);
			personas.put(1, persona1);
			personas.put(2, persona2);

			Set<Integer> keys = personas.keySet();
			for (Integer key : keys) {
				System.out.println(personas.get(key));
			}

			System.out.println("  **************** HashMap  2 ******************");
			HashMap<String, String> strings = new HashMap<String, String>();

			strings.put("2", " persona 2");
			strings.put("1", " persona 1");
			strings.put("3", " persona 3");
			strings.put("4", " persona 4");
			Set<String> keys2 = strings.keySet();
			for (String key2 : keys2) {

				System.out.println(strings.get(key2));

			}

		}

		{

			System.out.println("  **************** HasTable  ******************");

			Persona persona1 = new Persona(1L, "Roger");
			Persona persona2 = new Persona(2L, "Juan");
			Persona persona3 = new Persona(3L, "Giovana");
			Persona persona4 = new Persona(4L, "Pedro");

			Hashtable<Persona, Persona> personas = new Hashtable<Persona, Persona>();

			personas.put(persona3, persona3);
			personas.put(persona4, persona4);
			personas.put(persona1, persona1);
			personas.put(persona2, persona2);

			Set<Persona> keys = personas.keySet();
			for (Persona key : keys) {
				System.out.println(personas.get(key));
			}

		}
		
		{

			System.out.println(" ***** TreeMap ***** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");

			//Map<Long, Persona> personas = new TreeMap<>();
			Map<Long, Persona> personas = new TreeMap();

			personas.put(4L, persona4);
			personas.put(2L, persona2);
			personas.put(1L, persona1);
			personas.put(3L, persona3);

			// Collections.sort(personas, new SortPersona());
			Iterator it = personas.keySet().iterator();

			while (it.hasNext()) {
				Long codigo = (Long) it.next();
				System.out.println(personas.get(codigo));

			}

		}
		
		{

			System.out.println(" ***** LinkedHashMap ***** ");
			Persona persona1 = new Persona(1L, "Juan");
			Persona persona2 = new Persona(2L, "Rosa");
			Persona persona3 = new Persona(3L, "Pedro");
			Persona persona4 = new Persona(4L, "Luis");

			Map<Long, Persona> personas = new LinkedHashMap<Long, Persona>();

			personas.put(4L, persona4);
			personas.put(2L, persona2);
			personas.put(1L, persona1);
			personas.put(3L, persona3);

			// Collections.sort(personas, new SortPersona());
			Iterator it = personas.keySet().iterator();

			while (it.hasNext()) {
				Long codigo = (Long) it.next();
				System.out.println(personas.get(codigo));

			}

		}
		
	}

}
