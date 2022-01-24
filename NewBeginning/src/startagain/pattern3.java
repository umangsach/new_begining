package startagain;

import java.util.Scanner;

public class pattern3 
{
	int i,j;
	public void starprint1(int num) 
	{
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		pattern3 py=new pattern3();
		py.starprint1(num);
		
		
	}

}
