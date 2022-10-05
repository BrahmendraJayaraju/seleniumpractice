package myown;

public class account {

private int amt;

public account(int n)
{
	amt=n;
}
	
	
	
public 	int getamount()
	{
		return amt;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		account a1=new account(500);
		
		
		int d=a1.getamount();
		
		
		System.out.println(d);
		
		
		
		account p1=new account(1000);
		
			int p=p1.getamount();

			System.out.println(p);
			
			
			
		account p2=new account(2000);
		
		int pa=p2.getamount();
		
			
		System.out.println(pa);
		
				
				

	}

}
