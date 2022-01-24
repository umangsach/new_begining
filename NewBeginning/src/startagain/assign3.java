package startagain;

public class assign3 
{
	public assign3() 
	{
		this(5,6,8);
		System.out.println("default constructor");
	}
	public assign3(int a)
	{
		this(1,2,3,4);
		System.out.println("One parameterized constructor");
	}
	public assign3(int a, int b)
	{
		this(20);
		System.out.println("two parameterized constructor");
	}
	public assign3(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	public assign3(int a, int b, int c, int d)
	{
		this();
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		assign3 ab=new assign3(12,23);
	}

}
