package testSample;

public class printNum {
	
	public static void main (String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("2 * " +i + " = " + (2*i));
			
		}
		
		char ch;
		
		for (ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.println(ch);
		}
		int sum = 1;
		
		System.out.println("printing the fibonacci series!!");
		
			int n1=0,n2=1,n3,i,count=10;
			
			System.out.print(n1+" "+n2);
			for(i=2;i<count;++i)
			{
				n3=n1+n2;
				System.out.print(" " + n3);
				n1=n2;
				n2=n3;
			}
			
			
		System.out.println("\n hi gaurav");
	}

}


