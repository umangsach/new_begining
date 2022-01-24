package startagain;

import java.util.Scanner;

public class pattern4 
{
	int i,j; int k=1;
	public void starprint1(int num) 
	{
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		pattern4 pt=new pattern4();
		pt.starprint1(num);
		
		
	}

}
