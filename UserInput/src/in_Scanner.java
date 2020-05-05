import java.util.Scanner;
class myMainClass
{
	public static void main(String[] args)
	{
		Scanner MyObj = new Scanner(System.in);
		System.out.println("Enter name,age and salary");
		
		String name = MyObj.nextLine();
		
		int age = MyObj.nextInt();
		
		double salary = MyObj.nextDouble();
		
		
		System.out.println("name: "+name);
		
		System.out.println("age: "+age);
		
		System.out.println("salary: "+salary);
		
		
		
	}
	
}


