package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaduponRowNumber 
{
	public void Rowdata(int rownum, String path) throws IOException 
	{
		File f= new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader bfr=new BufferedReader(fr);
		int a=0;
		String s;
		while((s=bfr.readLine())!=null)
		{
			a=a+1;
			if(a==rownum)
			{
				System.out.println(s);
			}
		}
		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the path");
		String p=sc.next();
		System.out.println("Enter the row number from where you want to read the data?");
		int vb=sc.nextInt();
		ReaduponRowNumber gb=new ReaduponRowNumber();
		gb.Rowdata(vb, p);
		
	}

}
