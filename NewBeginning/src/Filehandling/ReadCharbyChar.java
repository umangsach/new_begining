package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharbyChar 
{
	public void charbychar(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the path");
		String Path=sc.next();
		ReadCharbyChar rd=new ReadCharbyChar();
		rd.charbychar(Path);
		
	}

}
