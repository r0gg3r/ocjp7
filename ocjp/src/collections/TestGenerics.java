package collections;

public class TestGenerics<T> {
	
	T anInstance;
	T [] anArrayOfts;
	
	TestGenerics(T anInstance) {
		this.anInstance = anInstance;
		
	}
	
	T getT(){
		
		return anInstance;
	}

}
