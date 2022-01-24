package startagain;

public class assign4 
{
	public void m()
	{
		this.m4(1,2,3,5);
		System.out.println("Default method");
	}
	public void m1(int a)
	{
		this.m();
		System.out.println("One parameterized method");
	}
	public void m2(int a, int b)
	{
		this.m1(2);
		System.out.println("Two parameterized method");
	}
	public void m3(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	public void m4(int a, int b, int c, int d)
	{
		this.m3(2, 3, 4);
		System.out.println("Four paramertized method");
	}
	public static void main(String[] args) {
		assign4 ac=new assign4();
		assign3 ab=new assign3(12,23);
		// Has a relationship show krne ke liye dusri class ke object ko yaha use kiya hai .
		ac.m2(2,5);
	}

}
