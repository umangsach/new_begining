package startagain;

import java.util.Scanner;

public class primenum 
{
	int temp=0;
	public void primenumber(int num)
	{
		int i;
		for(i=2;i<=num-1; i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Number is not a Prime Number =" +num);
		}
		else
		{
			System.out.println("Entered Number is a Prime Number "+num );
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		primenum df=new primenum();
		df.primenumber(num);
		
	}

}
