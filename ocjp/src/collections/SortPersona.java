package collections;

import java.util.Comparator;

public class SortPersona implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getCodigo().compareTo(o2.getCodigo());
	}

}
