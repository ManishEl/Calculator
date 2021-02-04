package Addition;

import java.util.Scanner;

public class Add {

	int sum;
	String number;
	
	public int addition(String numbers)
	{
		String[] a=numbers.trim().split(",");
		if(a[0].isEmpty() && a[1].isEmpty())
		{
			return 0;
		} 
		
		for(int i=0;i<a.length;i++)
		{
			int one=Integer.parseInt(a[i]);
			sum=sum+one;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		String numbers=s.nextLine();
		
		if(numbers.isBlank())
		{
			System.out.println(sum);
			System.exit(0);
		}
		
		Add a=new Add();
		sum=a.addition(numbers);
		
		System.out.println(sum);
	}
	
}
