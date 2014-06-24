package collections.types;

import java.util.ArrayList;
import java.util.List;




public  class Generic implements IGeneric<Dog> {
	private List<Dog> lista  = new ArrayList<>();
	@Override
	public void add(Dog value) {
		
		lista.add(value);
	}

}

