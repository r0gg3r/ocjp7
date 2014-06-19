package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		{

			Persona persona1 = new Persona(1L, "Roger");
			Persona persona2 = new Persona(2L, "Juan");
			Persona persona3 = new Persona(3L, "Giovana");
			Persona persona4 = new Persona(4L, "Giovana");
			List<Persona> personas = new ArrayList<Persona>();
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona1);
			personas.add(persona2);
			// ordenando una colección
			//Collections.sort(personas, new SortPersonas());

			for (Persona persona : personas) {
				System.out.println(persona);
			}

		}
		
		
		
		{
			
			System.out.println("  **************** HashMap  ******************");

			Persona persona1 = new Persona(1L, "Roger");
			Persona persona2 = new Persona(2L, "Juan");
			Persona persona3 = new Persona(3L, "Giovana");
			Persona persona4 = new Persona(4L, "Pedro");
			HashMap<Integer,Persona> personas = new HashMap<Integer,Persona>();

			personas.put(3,persona3);
			personas.put(4,persona4);
			personas.put(1,persona1);
			personas.put(2,persona2);
			
			Set<Integer> keys =   personas.keySet();
			for (Integer key : keys) {
			 System.out.println(  personas.get(key) );
			}
			
			System.out.println("  **************** HashMap  2 ******************");
			HashMap<String,String> strings = new HashMap<String,String>();
			
			strings.put("2", " persona 2");
			strings.put("1", " persona 1");
			strings.put("3", " persona 3");
			strings.put("4", " persona 4");
			Set<String> keys2   =  strings.keySet();
			for (String key2 : keys2) {
				
				 System.out.println(strings.get(key2) );
				
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
		

	}

}

//implements Comparable<Persona>
class Persona  {

	private Long codigo;

	private String nombre;

	public Persona() {

	}

	public Persona(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "{ codigo:" + this.codigo + ", descripcion:" + this.nombre
				+ " }";
	}

	/*@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof Persona) {
			this.getCodigo().equals(((Persona) obj).getCodigo());
		}

		return false;

	}

	@Override
	public int hashCode() {

		return this.getCodigo().intValue();

	}*/

	/*@Override
	public int compareTo(Persona o) {

		return this.getCodigo().intValue() - o.getCodigo().intValue();
	}*/

}

class SortPersonas implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getCodigo().compareTo(o2.getCodigo());
	}

}