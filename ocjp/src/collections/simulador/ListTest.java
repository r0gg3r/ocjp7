package collections.simulador;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	
	public static void main(String args[]){
	      List<String> s1 = new ArrayList( );
	      s1.add("a");
	      s1.add("b");
	      s1.add(1, "c");
	      System.out.println("index 1 "+ s1.get(0));
	      System.out.println("index 2 "+ s1.get(1));
	      System.out.println("index 3 "+ s1.get(2));
	      
	      
	      for (String s : s1) {
			 System.err.println( s );
	      }
	      
	      List<String> s2 = new ArrayList(  s1.subList(4, 4) );
	      System.out.println(" lista 2 --"+s2.size());
	      for (String string : s2) {
	    	  System.out.println( " string "+string);
			
		}
	      
	      s1.addAll(s2);
	      System.out.println(s1);
	   }

}
