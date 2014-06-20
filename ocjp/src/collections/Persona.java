package collections;

 
public class Persona implements Comparable<Persona>{

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

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof Persona) {
			return this.getCodigo().equals(((Persona) obj).getCodigo());
		}

		return false;

	}

	@Override
	public int hashCode() {
		return this.getCodigo().intValue();
	}

	@Override
	public int compareTo(Persona o) {
		return this.getCodigo().intValue() - o.getCodigo().intValue(); 
	}

}