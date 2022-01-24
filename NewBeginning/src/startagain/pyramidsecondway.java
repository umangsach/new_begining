package startagain;

import java.util.Scanner;

public class pyramidsecondway 
{
	int i,j; int k = 0;
	public void secondway(int num) 
	{
		for (i = 1; i <= num; i++,k=0)
		{
		      for (j = 1; j <= num - i; ++j) 
		      {
		        System.out.print("  ");
		      }
		      while (k != 2 * i -1) 
		      {
		    	  System.out.print("* ");
		          ++k;
		      }
		      System.out.println();
		}
		
	}
		public static void main(String[] args)
		{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the number");
		int num=sc.nextInt();
		pyramidsecondway py=new pyramidsecondway();
		py.secondway(num);

	    }
}
