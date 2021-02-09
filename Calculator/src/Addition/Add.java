package Addition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Add {

	int sum;
	String number;
	
	 
	public int addition(StringBuilder numbers)
	{
		
		
		 
		String aq=numbers.toString();
		
		String w=aq.replaceAll("\\s", "");
		
		//w.split("\\[");
		//w.replaceAll("\\]", "");
		
	String[] a=w.trim().split(",");

	
	
	
	  if(a[0].isEmpty() && a[1].isEmpty()) { return 0; }
	 
		
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
		String read="";
		StringBuilder numbers=new StringBuilder();
		
		while(s.hasNextLine())
		{
			read=s.nextLine();
			
		
		if(read == null || read.isBlank()){ //if the line is empty
	        break;  //exit the loop
	    }
		
		numbers.append(read);
		}
		
		
		
		
		
		 Add a=new Add();
		 
		 sum=a.addition(numbers);
		 
		 
			 System.out.println(sum);
			
			 
		 
		
	}
	
}
