package startagain;

import java.util.Scanner;

public class pattern5 
{
	int i,j,k,l;
	public void starprint1(int num) 
	{
		for(i=1;i<=num;i++)
		{
			for(k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			  for(j=1;j<=i;j++)
			    {
				  System.out.print("*");
			    }
			  for(l=i;l>1;l--)
			  {
				  System.out.print("*");
			  }
			System.out.println(" ");
		}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		pattern5 pt=new pattern5();
		pt.starprint1(num);
		
		
	}

}
