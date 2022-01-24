package startagain;

import java.util.Scanner;

public class pattern1 
{
	int i,j;
	public void starprint1(int num) 
	{
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		pattern1 pt=new pattern1();
		pt.starprint1(num);
		
		
	}

}
