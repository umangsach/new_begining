package startagain;

import java.util.Scanner;

public class palindromeNum 
{
	int rev=0; int rem; int temp =0;
	public void palindrome(int num)
	{
		temp = num; 
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Entered number is a Palindrome Number ="+ rev);
		}
		else
		{
			System.out.println("Entered number is not a Palindrome Number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		palindromeNum pn=new palindromeNum();
		pn.palindrome(number);
		
	}

}
