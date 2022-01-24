package startagain;

import java.util.Scanner;

public class fibonacci 
{
	int num=0; int num2=1; int c; int num3;
	public void fibo(int num3)
	{
		for(int i=1;i<=num3;i++)
		{
			int c=num+num2;
			num=num2;
			num2=c;
			System.out.println("Series Number is " +c);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		fibonacci fb=new fibonacci();
		fb.fibo(number);
	}

}
