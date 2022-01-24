package startagain;

import java.util.Scanner;

public class swapwithoutvar 
{
	int a; int b;
	public void swapping()
	{
		//int a=0; int b=0; int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
	    a = sc.nextInt();
		System.out.println("Enter the value of b ");
		b= sc.nextInt();
		System.out.println("Before Swapping " +a +" " +b);
		a=a+b;
		b=a-b;
		a=b-a;
		System.out.println("Value of a " +a);
		System.out.println("Value of b "+b);
		System.out.println("After Swapping "+a + " " +b);
	}
	public static void main(String[] args) {
		swapwithvar sw=new swapwithvar();
		sw.swapping();
	}

}
