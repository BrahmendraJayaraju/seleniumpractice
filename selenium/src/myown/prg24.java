package myown;

import java.util.ArrayList;
import java.util.List;

public class prg24 {

	public static void main(String[] args) {
		
		
		List<String>  l1=new ArrayList<>();
		
		l1.add("hdw");
		
		l1.add("b");
		l1.add("g");
		l1.add("rfjfjr");
		
		int value=l1.size();
		
		System.out.println(value);
		
		
		for(int i=0;i<value;i++)
		{
			String a1=l1.get(i);
			
			System.out.println(a1);
			
		}
		
		
		
		

	}

}
