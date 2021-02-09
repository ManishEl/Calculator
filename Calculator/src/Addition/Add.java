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
	
	 
	public int addition(String[] a)
	{
		
		
	

	
	
	
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
		ArrayList<Integer> n=new ArrayList<>();
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
		
		 
			String aq=numbers.toString();
			
			String w=aq.replaceAll("\\s", "");
			
			//w.split("\\[");
			//w.replaceAll("\\]", "");
			
		String[] an=w.trim().split("[,;%$#@!]+");
		
		try
		{
			for(int i=0;i<an.length;i++)
			{
				if(Integer.parseInt(an[i])<0)
				{
					n.add(Integer.parseInt(an[i]));
				}
			}
			for(int i=0;i<n.size();i++)
			{
				throw new Exception("number is negative"+n);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		
		
		
		 Add a=new Add();
		 
		 sum=a.addition(an);
		 
		 
			 System.out.println(sum);
			
			 
		 
		
	}
	
}
