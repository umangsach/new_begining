package startagain;

import java.util.Scanner;

public class TablePrint 
{
	int number; int i; int tab;
	public void table(int number) 
	{
		for(i=1;i<=10;i++)
		{
			tab = number*i;
			System.out.println(number + "*" + i +"=" +tab);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for Table to Print ");
		int number = sc.nextInt();
		TablePrint tb=new TablePrint();
		tb.table(number);
		
	}

}
