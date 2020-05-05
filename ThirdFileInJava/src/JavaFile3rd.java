
public class JavaFile3rd 
{
	public static void main(String[] args)
	{
		JavaFile3rd outerClass = new JavaFile3rd();
		animals type = outerClass.new dog();
		type.speak();		
	}

	class animals
	{
		public void speak()
		{
			System.out.println("memememe");
		}
	}

	class dog extends animals
	{
		
		public  void speak()
		{
			System.out.println("Voww VOWw");	
		}
	}
	
	
	

class MyClass {
  public  void imp() {
	  //JavaFile3rd  myObj = new  JavaFile3rd (System.in);
    System.out.println("Enter username");

//    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}


	

}
	
	
	


