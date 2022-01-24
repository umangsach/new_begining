package startagain;

import java.util.Scanner;

public class ArmstrongNumber 
{
	int number; int arms=0; int rem; int length=0; int i; int multi=1;
	public void lenthfinding(int number) 
	{
		int temp1=number;
		while(number!=0)          //First All We Will Find the lenght of the number
		{
			number=number/10;
			length=length+1;
		}
		System.out.println("length is "+length);
		
	}
	public void armstrong(int number) 
	{
		int temp2=number;
		while(number!=0)
		{
			//System.out.println("Number print "+number);
			rem=number%10;
			//System.out.println("Second Lenght " +length);
			for(i=1;i<=length;i++)
			{
				multi = multi*rem;
				System.out.println("multi value is " +multi);
			}
			arms = arms+multi;
			System.out.println("Arms number is " +arms);
			multi = 1;
			number=number/10;
		}
		if(arms==temp2)
		{
			System.out.println("Entered Number Is An Armstrong Number " +arms);
		}
		else
		{
			System.out.println("Entered Number Is Not An Armstrong Number " +arms);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		ArmstrongNumber am=new ArmstrongNumber();
		am.lenthfinding(number);
		am.armstrong(number);
		
		
	}

}
