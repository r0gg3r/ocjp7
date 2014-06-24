package collections;

public class UseTwo<T,Z> {
	
	T one;
	Z two;
	
	public UseTwo(T one, Z two) {
		this.one = one;
		this.two = two;
	}
	
	T getT(){
		return one;
	}
	
	Z getX(){
		return two;
	}
	
	public static void main(String[] args) {
		
		UseTwo<String, Integer> twos  = new UseTwo<String, Integer>("foo",42);
		
		System.out.println( " one : "+twos.getT());
		System.out.println( " two : "+twos.getX());
 		
	}

}
