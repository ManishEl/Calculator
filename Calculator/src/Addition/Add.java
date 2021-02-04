package Addition;

import java.util.Scanner;

public class Add {

	int sum;
	String number;
	
	public int addition(String numbers)
	{
		String[] a=numbers.trim().split(",");
		int one=Integer.parseInt(a[0]);
		int two=Integer.parseInt(a[1]);
		
		sum=one+two;
		return sum;
	}
	
	public static void main(String[] args)
	{
		int sum;
		Scanner s=new Scanner(System.in);
		String numbers=s.nextLine();
		
		Add a=new Add();
		sum=a.addition(numbers);
		
		System.out.println(sum);
	}
	
}
