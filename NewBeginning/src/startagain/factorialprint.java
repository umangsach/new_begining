package startagain;

import java.util.Scanner;

public class factorialprint 
{
	int num; int i; int fact=1;
	public void factnum(int num)
	{
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of a number " +num +" is = " +fact);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		factorialprint fp=new factorialprint();
		fp.factnum(num);
		
	}

}
