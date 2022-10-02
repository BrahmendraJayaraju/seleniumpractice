package myown;

import java.util.Date;

public class prg65 {

	public static void main(String[] args) {
	
		
		
	Date d=new Date();
	System.out.println(d);
	String str=d.toString();
	
		
	String[] s=str.split(" ");
	
	
	
	String day=s[2];
	System.out.println(day);
		
	String yr=s[5];
	System.out.println(yr);
		
		
	}

}
