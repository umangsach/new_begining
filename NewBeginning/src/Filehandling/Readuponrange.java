package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readuponrange 
{
	public void ReadDataofRange(int startline, int endline, String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader bfr=new BufferedReader(fr);
		int a=0;
		String s;
		while((s=bfr.readLine())!=null)
		{
			a=a+1;
			if((a>=startline) && (a<=endline))
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file path");
		String c= sc.next();
		System.out.println("Enter the startline from where you want to read the data");
		int we=sc.nextInt();
		System.out.println("Enter the endline till where you want to read the data");
		int er=sc.nextInt();
		
		Readuponrange rd=new Readuponrange();
		rd.ReadDataofRange(we, er, c);
	}

}
