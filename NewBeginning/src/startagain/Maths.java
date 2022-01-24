package startagain;

public class Maths {
	public int sum(int a, int b)
	{
	int c=a+b;
	return c;
	}
	public int multi(int d, int e)
	{
		int f = d*e;
		return f;
	}
	public int sub(int q, int w)
	{
		int s=q-w;
		return s;
	}
	public int div(int h, int x)
	{
		int z=h/x;
		return z;
	}
  public static void main(String[] args) {
		Maths abs=new Maths();
		int divi=abs.div(10,2);
		System.out.println("Divide value is "+divi);
		int sub=abs.sub(divi, 2);
		System.out.println("Substract value is "+sub);
		int add2 = abs.sum(sub, 2);
		System.out.println("Add2 value is "+add2);
		int subt=abs.sub(add2, 2);
		System.out.println("Substract value is "+subt);
		int multiply = abs.multi(subt, 2);
		System.out.println("Multiply value is "+multiply);
		System.out.println("Final Answer is "+multiply);
	}
}
