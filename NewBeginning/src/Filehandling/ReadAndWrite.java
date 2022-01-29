package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite 
{
	public void Readdata() throws IOException 
	{
		System.out.println("Enter the read file path");
		Scanner d=new Scanner(System.in);
		String path =d.next();
		File f=new File(path);
		FileReader zx=new FileReader(f);
		BufferedReader bn=new BufferedReader(zx);

		System.out.println("Enter the write file path");
		Scanner h=new Scanner(System.in);
		String path1 =h.next();
		File k=new File(path1);
		FileWriter er=new FileWriter(k);
		BufferedWriter kl=new BufferedWriter(er);
		String s;
		while((s=bn.readLine())!=null)
		{
			kl.write(s);
			kl.newLine();
		}
		kl.close();
		System.out.println("Copy paste successful");
		
	}
	public static void main(String[] args) throws IOException 
	{
		ReadAndWrite rw=new ReadAndWrite();
		rw.Readdata();
		
	}

}
