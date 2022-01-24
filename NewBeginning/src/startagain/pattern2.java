package startagain;

import java.util.Scanner;

public class pattern2 
{
		int i,j;
		public void starprint2(int num) 
		{
			for(i=1;i<=num;i++)
			{
				for(j=i;j<=num;j++)
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
			pattern2 py=new pattern2();
			py.starprint2(num);
			
			
		}

}