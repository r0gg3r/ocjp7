package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	    Collections.sort(personas, new SortPersonas());
	    
	    for (Persona persona : personas) {
		System.out.println( persona);
	    }
	    
	}

    }

}



// 
class Persona implements Comparable<Persona>{

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
        return "{ codigo:"+this.codigo+", descripcion:"+this.nombre+" }";
    }

    @Override
    public boolean equals(Object obj) {
	
	if(this == obj){
	    return true ;
	}
	
	if(obj instanceof  Persona){
	   this.getCodigo().equals( ((Persona)obj).getCodigo());
	}
	
	return false;
        
    }
    
    @Override
    public int hashCode() {
	
        return this.getCodigo().intValue();
        
    }
    
    @Override
    public int compareTo(Persona o) {
	
	return  this.getCodigo().intValue()-o.getCodigo().intValue();
    }
    
    
}

class SortPersonas implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
	return o1.getCodigo().compareTo(o2.getCodigo());
    }
    
}