package myown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class prg44 {

	public static void main(String[] args) {
		
		
		
		
		List<String>   t1=new ArrayList<String>();
		
		
t1.add("c");
		
		t1.add("a");
		t1.add("b");
		t1.add("b");
		
		
		
		int a=t1.size();
		
		
		HashSet<String>    t2=new HashSet<>(t1);
		
		
		
		int b=t2.size();
		
		
		
		if(a==b)
		{
			System.out.print("same");
		}
		else
		{
			System.out.print("duplicate");
		}
		
		
		
		
		
		
		
		
		

	}

}
