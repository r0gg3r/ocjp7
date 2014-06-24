package collections.types;

public class Dog  extends Animal{
	
	private String nombres;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String nombres) {
		
		 this.nombres  = nombres;
	
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	

}
