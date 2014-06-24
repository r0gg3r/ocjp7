package collections.types;

import java.util.ArrayList;
import java.util.List;

public class CollectionTypeGenerics {
	
	 private static List<Animal>  animals;
	
	public static void main(String[] args) {
		List<Dog>  dogs = new ArrayList<>();
		dogs.add(new  Dog("perro"));
		dogs.add(new  Dog("gato"));
		dogs.add(new  Dog("rarton"));
		addAll(dogs);
		add( dogs);
	}

	private static void addAll(List<? extends Animal> animal) {
		//animals.add(animal); incorrecto
		for (Animal _animal : animal) {
			
		}
	}
	
	public static void add( List<?> list){
		for (Object object : list) {
			System.out.println( " object : "+   ((Dog) object).getNombres());
		}
	}

}
