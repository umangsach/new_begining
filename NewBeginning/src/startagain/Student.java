package startagain;

public class Student {
	int rollnumber;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome you all");
	}
	public void display2()
	{
		System.out.println("You all learn automation");
	}
public static void main(String[] args) {
		
		Student D = new Student();
		D.display1();
		D.rollnumber=21;
		int roll=D.rollnumber;
		System.out.println("Roll number is"+" "+roll);
		D.age=28;
		int age1 = D.age;
		System.out.println("MY Age IS"+" "+age1);
		D.display2();
	}

}
