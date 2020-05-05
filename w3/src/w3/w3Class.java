package w3;
   

		//Create an Object

public class w3Class 
{
	int x = 5;
	public static void main(String[] args)
	{
//		w3Class obj = new w3Class();
//		System.out.println(obj.x);
//		
//		MyClass1.num();                  // class call
//		
//		MyClass1 myObj1 = new MyClass1();	//method call - first crate new object	
//		myObj1.PrintMessage();		    // after that we  can call  
		//myObj1.num();
		
//		Room.CookFood();
//		Room.Bathroom();
//		Room.Sleep();
//		Room.BaithRaheHain();
//		OtherClass.man();
//		OtherClass.TestObj();
//		MyClasses.min();
//		MyMod.Num();
//		MyModify.Numm();
//		Person.nam();
//		MyClss1.myMethod();
//		MyClas1.myStaticMethod();
//		MyClas1.CallingNonStaticMethodInternally();
//		
//		Car myobj2=new Car();
//		myobj2.fullThrottle();
//	    myobj2.speed(3);
//	    
//	    name.fun();
	    
	    ConstructorClass myObj = new ConstructorClass();
	    myObj.ConstructorTest();
	 
	    ConstructorClass myObj1 = new ConstructorClass(101);
	    myObj1.ConstructorTest();
	    
	    ConstructorClass1 myObj2 = new ConstructorClass1(111);
	    myObj2.constro();
	    
	    Car1 myCar1 = new Car1(1969, "Mustang");
	    myCar1.cardetail();
	    
	    modifierFinal myOb = new modifierFinal();
	    myOb.modifier();
	    
	    MyStatic.myStaticMethod();
	    MyStatic myObjt = new MyStatic(); // Create an object of MyClass
	    myObjt.myPublicMethod(); // Call the public method
				 
	    AbstracClass.abst();
	}		
}




				//Java Modifiers
				//Java Modifiers





					//Final
	class modifierFinal
	{
	    final int x = 10;
	    final double PI = 3.14;

		public  void modifier() 
		{
			modifierFinal myObj2 = new modifierFinal();
			// myObj2.x = 50; // will generate an error: cannot assign a value to a final variable
			// myObj2.PI = 25; // will generate an error: cannot assign a value to a final variable
		    System.out.println(x);
		    System.out.println(PI);
	
		  }
		
		
	}	
	
	
	class MyStatic 
	{
		  // Static method
		  static void myStaticMethod() 
		  {
			  System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod()
		  {
			  System.out.println("Public methods must be called by creating objects");
		  }	  
	
		  // Main method
		  public static void Static() 
		  {
			    myStaticMethod(); // Call the static method
			    // myPublicMethod(); This would output an error

			 
		  }
	}
	
	
			//abstract

	// Code from filename: Person.java
	// abstract class
	abstract class Person 
	{
	  public String fname = "John";
	  public int age = 24;
	  public abstract void study(); // abstract method
	}

	// Subclass (inherit from Person)
	  class Student extends Person 
	  {
		public int graduationYear = 2018;
		public void study() 
			{ // the body of the abstract method is provided here
				System.out.println("Studying all day long");
			}
	  }
	  
	  class employee extends Person 	  
	  {
		  public void study()
		  {
			  System.out.println("Employee is working all day accept weekened ");  
		  } 
		  
		  public int graduationYear = 2018;
		
	  }
	// End code from filename: Person.java

	// Code from filename: MyClass.java
	class AbstracClass 
	{
	  public static void abst()
	   {
		    // create an object of the Student class (which inherits attributes and methods from Person)
		    Student myObj = new Student();
	
		    System.out.println("Name: " + myObj.fname);
		    System.out.println("Age: " + myObj.age);
		    System.out.println("Graduation Year: " + myObj.graduationYear);
		    myObj.study(); // call abstract method
	  }
	}
	 



					//Java Constructors
	
	
	//Create a MyClass class
	 class ConstructorClass
	 {
		int x;  // Create a class attribute
	
		// Create a class constructor for the MyClass class
		public ConstructorClass()
		{
			x= 5;  // Set the initial value for the class attribute x
		}
		
		public ConstructorClass(int val)
		{
			x= val;  // Set the initial value for the class attribute x
		}
	
		public void ConstructorTest() 
		{
			 // Create an object of class MyClass (This will call the constructor)
			System.out.println(x); // Print the value of x
		}
	 }
	
	//Outputs 5,101
	 
	 
	 
	 class ConstructorClass1 
	 {
		  int x;

	public ConstructorClass1(int y)
	 {
		    x = y;
	  }

	public void constro()
	 {
		    
		    System.out.println(x);
	  }
	 }

		// Outputs 111
	 
	 
	 class Car1 
	 {
		  int modelYear;
		  String modelName;

	public Car1(int year, String name) 
	  {
		    modelYear = year;
		    modelName = name;
	  }

	public  void cardetail()
	{
	        Car1 myCar1 = new Car1(1969, "Mustang"); 
		    System.out.println(myCar1.modelYear + " " + myCar1.modelName);
	}
	
		}

		// Outputs 1969 Mustang
	 
	 
	 
	 
	 
	 /*public class MyClass
	 {
		  int x;
		  public MyClass(int y) 
		  {
			  x = y;
	      }

	 public static void main()
	 {
		    MyClass myObj = new MyClass(5);
		    System.out.println(myObj.x);
	 }
	 
	}

		// Outputs 5*/
		 



			//JAVA CLASS METHOD

	class MyClss1 
	{
	   static void myMethod()
	   {
		  System.out.println("Hello World!");
	   }

	   public static void method() 
       {
	  		myMethod();
       }	  
	}
	
	
	
	class name
	{
		public static void fun()
		{
				call(5);
				
		}
		
		public static void call(int age)
		{ 
			System.out.println(" infinite call function");
			for(int i=age;i<age+5;i++)
			{
		
				call(i);
			}
	
		}
	}
	
	
	
	
	 class Car {
		 
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		   
		    //Car myCar=new Car(); 
		    //myCar.speed(5);
		  }
		}




	
	
			//Static vs. Non-Static
	
	class MyClas1 
	   {
		  // Static method
	    static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() 
		  {
		    System.out.println("Non static methods must be called by creating objects");
		  }

		  // Main method
		  public static void CallingNonStaticMethodInternally()
		  {
		    myStaticMethod(); // Call the static method
		    // myPublicMethod(); This would compile an error

		    MyClas1 myObj = new MyClas1(); // Create an object of MyClass
		    myObj.myPublicMethod();	// Call the public method on the object
		  }
		}
		 
	
	
	

	 


				//Java Class Attributes


		//Modify Attributes

 class MyClasses1
	{
	  int  x;

	  public static void min()
		  {
		    MyClass1 myObj = new MyClass1();
		    myObj.x = 400;
		    System.out.println(myObj.x);
		  }
	}
 					
 			//Multiple Objects
 	
  class MyMod {
	  int x = 110;

	  public static void Num() 
	   {
		    MyMod myObj = new MyMod();
		    myObj.x = 25; // x is now 25
		    System.out.println("Updated value = " + myObj.x);
	   }
	}
  
  			
  
  class MyModify
  {
	  int x = 50;

	  public static void Numm()
		{
		    MyModify myObj1 = new MyModify();  // Object 1
		    MyModify myObj2 = new MyModify();  // Object 2
		    myObj2.x = 2500;
		    System.out.println(myObj1.x);  // Outputs 5
		    System.out.println(myObj2.x);  // Outputs 25
	  }
	}
  
  
  		//Multiple Attributes
  
   class Person {
	  String fname = "Hasan";
	  String lname = "Md";
	  int age = 21;

	  public static void nam() {
	    Person myObj = new Person();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Age: " + myObj.age);
	  }
	}




	class OtherClass1
	 {
		  int x = 10001;
		  int y =20;
		  public static void man()
		  {
			  OtherClass1 myObj = new OtherClass1();
		    System.out.println(myObj.x);
		  }
		  
		  public static void TestObj()
		  {
			  
			  OtherClass1 myObj = new OtherClass1();
		    System.out.println(myObj.y);
		  }
	}
	
	
			//Multiple Objects
	
	class MyClass1
	{
		  int x = 10;
	
		  public static void num() 
		  {
			    MyClass1 myObj1 = new MyClass1();  // Object 1
			    MyClass1 myObj2 = new MyClass1();  // Object 2
			    System.out.println(myObj1.x);
			    System.out.println(myObj2.x);
		  }
		  
		  public void PrintMessage()
		  {
			  System.out.println("You have called non-static method");
		  }
		  
	}
	
	class Room
	{
		String Chair;
		String Bed;
		String Table;
		
		public static String CookFood() 
		{
			return "Biryani";
		}
		
		public static int Bathroom()
		{
			System.out.println("naha rahe hain");
			
			return 1;
		}
		
		public static void Sleep()
		{
			System.out.println("so rahe hain");
		}
		
		public static void BaithRaheHain()
		{
			System.out.println("Baith Rahe Hain rahe hain");
		}
	}
	
	
	
	

	
