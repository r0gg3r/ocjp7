package collections.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import collections.Persona;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(" ***** ArrayList ***** ");
		Persona persona1 = new Persona(1L, "Juan");
		Persona persona2 = new Persona(2L, "Rosa");
		Persona persona3 = new Persona(3L, "Pedro");
		Persona persona4 = new Persona(4L, "Luis");
		Persona persona5 = new Persona(5L, "Maria");
		//List<Persona> personas = new ArrayList<>();
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(persona1);
	
		personas.add(persona3);
		personas.add(persona4);
		personas.add(persona2);
		
		Collections.sort(personas);
		
		System.out.println( "lista ordenanda ");
		
		for (Persona persona : personas) {
			System.out.println(" persona "+ persona.toString());
		}
		
		int  result =  Collections.binarySearch(personas, persona5);
		
		System.out.println( "result  :"+result);
		
		
		personas.add((result+1)*-1,persona5);
		
		for (Persona persona : personas) {
			System.out.println(" persona "+ persona.toString());
		}
		
		
		String[] strings = new String[]{"juan","hugo","steban"};
		for (String string : strings) {
			System.out.println(" string : "+ string);
		}
		
		System.out.println( "array ordenado ");
		Arrays.sort(strings);
		for (String string : strings) {
			System.out.println(" string : "+ string);
		}
		
		
		int result2 = 	 Arrays.binarySearch(strings, "abel");
		System.out.println( "result  :"+ result2);
		
		
	}

}

