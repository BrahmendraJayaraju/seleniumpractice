package myown;

import java.util.ArrayList;
import java.util.Collections;

public class prg36 {

	public static void main(String[] args) {
	
	ArrayList<String> a1=new ArrayList<>();
	
	
	
	a1.add("d");
	a1.add("b");
	a1.add("a");
	a1.add("c");
	
	Collections.sort(a1);
	
	
	ArrayList<String>   a2=new ArrayList<>(a1);
	
	
	

	
	if(a1.equals(a2))
	{
		System.out.print("sorted");
	}
		
		
	else 
	{
		System.out.print("not sorted");
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
