import java.util.Scanner;

public class w3Syntax {

	public static void main(String[] args) {
		
		
		//print
	System.out.println("hello java");
	
	//variable declear
	String firstName = "Hsan";
    String lastName = "Md";
    String fullName = firstName + lastName;
    System.out.println(fullName); 
    
    
   //print the value of s+y
    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y
    
    //many variables adding
    int a = 5, b = 6, c = 50;
    System.out.println(a + b + c);
 
    
    // double adding
    int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
    int m = 60;
    
    System.out.println(minutesPerHour);
    System.out.println(m);
    
    
   // TYPE CASTING
    
    //widening casting
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    //narrowing cxasting
    double myDoble = 9.78;
    int myInnt = (int) myDoble; // Manual casting: double to int

    System.out.println(myDoble);   // Outputs 9.78
    System.out.println(myInnt);      // Outputs 9
    
 
    
    //Test
   String var1 = "10";
    int var2 = Integer.parseInt(var1);
    System.out.println(var1);
    System.out.println(var2);
    
    //test
    
    String str="123";
	int inum = 100;

	/* converting the string to an int value
	 * ,the value of inum2 would be 123 after
	 * conversion
	 */
	int inum2 = Integer.parseInt(str);
		
	int sum = inum+inum2;
	System.out.println("Result is: "+sum);
	
	
	
	// JAVA OPERATORS
	
	//arithmatic opretor
	  int d = 5;
	  int e = 3;
	  System.out.println(d * e);     //output 15
	  
	  
	  int f = 5;
	  ++f;
	  System.out.println(f);   //output 6
	  
	  
	  int g = 5;
	  --g;
	  System.out.println(g);   //output 4
	    
	  // assighnment operator
	  int h = 10;
	  h += 5;
	  System.out.println(h);     //output 15
	  
	  
     int i = 5;
     i &= 3;
     System.out.println(i);   //output 1
     
     
     int j = 5;
     j ^= 3;
     System.out.println(j);    //output 6
     
     
     int k = 5;
     k <<= 3;
     System.out.println(k); // outout 40
     
     
     //comparison operator
     int l = 5;
     int p = 3;
     System.out.println(l == p); // returns false because 5 is not equal to 3
     
     int q = 5;
     int r = 3;
     System.out.println(q >= r); // returns true because 5 is greater, or equal, to 3
     
     
     //logical operation
     int s = 5;
     System.out.println(s > 3 && s < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
     
     
     int t = 5;
     System.out.println(t > 3 || t < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
     
     
     
     //JAVA STRING
     
     //string lenght
     
    /* String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//here already we assumed bariable like .ABCD.. so thts resion it will not run
     System.out.println("The length of the txt string is: " + txt.length());    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     System.out.println("The length of the txt string is: " + txt.length());//output  the length of the string is :26
  */
     
     
     //more string method  eg.toUppercase() and toLowercase()
     String txt = "Hello World";
     System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
     System.out.println(txt.toLowerCase());   // Outputs "hello world"
     
     
     
     //finding character in a string
     String text = "please locate where'locate'occcure!";
      System.out.println(text.indexOf("wh"));
      
      
      //string concatenation
      String frstName = "John";
      String lasstName = "Doe";
      System.out.println(frstName + " " + lasstName);
      
      
//      concat();
//      print();
//      chararcter();
//      adding();
//      strningAdd();
//      mathMax();
//      mathMin();
//      sqrt();
//      mathAbs();
//      random();
//      bolean();	
//      greater();
//      bigger();
//      iff();
//      ifff();
//      elseif();
//      cond();
//      shortHand();
//      optr();
//      SWITCH();
//      defaul();
//      brother();
//      WHILE();
//      DOWHILE();
//      FOR();
//      LOOP();
//      eachloop();
//      SUM();
// 	 BREAK();
//	 CONTINUE();
//	 WhileBreak();
//	 WhileContinue();
//	 arr();
//	 arra();
//	 lenthg();
//	 loop();
//	 forEach();
//	 MultiDi();
	 multi();
	 myMethod("hasan", 22);
	 checkAge(33);
	 plusMethodInt(8,5);
	 plusMethodDouble(4.3,6.26);

	 String[] arrName = {};
	 num(arrName);
	
	 
	 
      
     
 
    

	}
	
	
				//Java Method Overloading
	
	
	 public static int plusMethodInt(int x, int y) {
		  return x + y;
	}

	static double plusMethodDouble(double x, double y) {
	  return x + y;
	}

	 static void num(String[] a) {
		  int myNum1 = plusMethodInt(8, 5);
		  double myNum2 = plusMethodDouble(4.3, 6.26);
	  System.out.println("int: " + myNum1);
	  System.out.println("double: " + myNum2);
	}


	
	 
	 
	 				//Java Method Parameters
	 
	 
	
	  // Create a checkAge() method with an integer variable called age
		 public static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }

	  public static void mann(String[] args) {
	    checkAge(20); // Call the checkAge method and pass along an age of 20
	  }	

	// Outputs "Access granted - You are old enough!"
	  

	public static void myMethod(String fname, int age) 
	{
		
	    System.out.println(fname + " is " + age);
	}
	
	public static void concat() 
	{
		//use concat()
	      String firstName = "John ";
	      String lastName = "Doe";
	      System.out.println(firstName.concat(lastName));
	}
	public static void print() {
		System.out.println("you have method");
	}
	public static void chararcter() {
		//Special character
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		String text = "We are the so-called \\Vikings\\ from the north.";
		System.out.println(text);
	}
	
	
	public static void adding()
	{
		//adding of sring
		int x = 10;
		int y = 20;
		int z = x + y; 
		System.out.println(z);// z will be 30 (an integer/number)
	}
	
	public static void strningAdd() {
	    String x = "10";
	    String y = "20";
	    String z = x + y;
	    System.out.println(z);
	}
	
	
	
	
	//JAVA MATH
	
	
	public static void mathMax() {
		//Math.max(x,y)
		  System.out.println(Math.max(5, 10)); //output 10
	}
	
	public static void mathMin() {
	    //Math.min(x,y)
		 System.out.println(Math.min(5, 10)); //output 5
	}
	
	public static void  sqrt() {
	  System.out.println(Math.sqrt(64));   //output 8
	}
	
	
	public static void mathAbs() {		
	//Math.abs(x)
        System.out.println(Math.abs(-4.7));  //output 4.7
	}
	
	public static void random() {
		//Math.random()
       System.out.println(Math.random());    //output 0.08124023293103777
	}
	
	
	

	//JAVA BOOLEANS
	
	public static void bolean() {
		//Boolean Values
	
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
	}
		
	
	public static void greater() {
		
	//Boolean Expression
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
	}
	
	
	
	public static void bigger() {
		
		int x = 10;
		System.out.println(x == 10); // returns true, because the value of x is equal to 10


	}
	
	
	
	
	
	
		//JAVA IF......ELSE STATEMENT
	
	
	
	public static void iff() {
		//The if Statement
	if (20 > 18) {
		  System.out.println("20 is greater than 18");
		}
	}
	
	
	
	public static void ifff() {
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}

	}
	
	
	public static void elsee() {
	//The else Statement
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
	}
	
	
	
	public static void elseif() {
		//The else if Statement
		
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
	}	// Outputs "Good evening."
	
	
	
	
	public static void cond()
	{
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
	}
	
	
	
	public static void shortHand() {
		//Short Hand If...Else (Ternary Operator)
		//Syntax  variable = (condition) ? expressionTrue :  expressionFalse;
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);    //output evening
	}
	
	
	
	
	
	
		// JAVA SWITCH SY\TATEMENT
	
	public static void SWITCH() {
		//creating Scanner object
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("enter the day number:");
		
		//Reading user input
        String dayNumberInString = scannerObject.nextLine();
        
        System.out.println("You entered string "+dayNumberInString);
		
        //"1"
		//Java Switch Statements
		int day = Integer.parseInt(dayNumberInString);
		
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		// Outputs "Thursday" (day 4)
	}
	
	
	
	public static void defaul() {
		
	//The default Keyword
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"
	}	
	
	
	
	
	//Test swich case 
	
	public static void brother() {
		
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter the brothrs name:");
		
		
        String NameInString = name.nextLine();
        
        System.out.println("You entered string "+ NameInString);
		
       
		
		//char name1 = Integer.parseInt( NameInString);
		
		switch (NameInString) {
		  case "ashique":
		    System.out.println("hello ashique");
		    break;
		  case "saddam":
		    System.out.println("hi suddy muhlatka bhai");
		    break;
		  case "hasan":
		    System.out.println("hello sir Hasan");
		    break;
		  case "danish":
		    System.out.println("hello motu set deny");
		    break;
		  case "faiz":
		    System.out.println("hello Mr.faiz");
		    break;
		
		}
		
		
	}
	
	public static void optr() {
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("entyer the first number");
		 String Number1InString = scannerObject.nextLine();
		 int num1=Integer.parseInt(Number1InString);


		System.out.println("entyer the operator");
		String oper = scannerObject.nextLine();

		System.out.println("entyer the second number");
		 String Number2InString = scannerObject.nextLine();
		 int num2=Integer.parseInt(Number2InString);
		 
		
	
		switch(oper) {
		
		case "+":
			int sum = num1 + num2; 
			System.out.println("sum=" + sum);
			break;
		case "-":
			int sub = num1 - num2; 
			System.out.println("sub=" + sub);
			break;
		case "*":
			int mul = num1 * num2; 
			System.out.println("mul=" + mul);
			break;
		case "%":
			int percnt = num1 % num2; 
			System.out.println("percnt=" + percnt);
			break;
		case "/":
			int div = num1 / num2; 
			System.out.println("div=" + div);
			break;
		default:
			System.out.println("invalid case");
			
			
		}
	}
	
	
	
	
	
	
		//WHILE LOOP
	
	
	public static void WHILE() {
		//Java While Loop
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
	}
	
	
	public static void SUM() {
		int array[] = {3,5,9,5,};
		int i=0;
		int sum=0;
		while(i<array.length)
		{
			sum=sum+array[i];
			i++;
		}
		System.out.println("sum="+sum);  //output 22
		}


	
	
	public static void DOWHILE() {
		
		//The Do/While Loop
		//Do while is used, when you want to execute the block of code at least at once.
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	}
	
	
	
	
				//FOR LOOP
	
	public static void FOR() {
		
		//Java For Loop
			
			for (int i = 0; i < 5; i++) 
				  System.out.println(i);
				}
	
	
	
		public static void LOOP() {
			//Another Example
			
			for (int i = 0; i <= 10; i = i + 2) {
				  System.out.println(i);
				}
		}
		
		
		public static void eachloop() {
		
			//For-Each Loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
	}
		
		
		
		//JAVA BREAK AND CONTIONUE
		
		
		public static void BREAK() {
		
			
			//Java Break
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		}	
		
		
		public static void CONTINUE() {
			
			//puJava Continue
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		}	 
		
		
		
		public static void WhileBreak() {
		//Break and Continue in While Loop
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 5) {
		    break;
		  }
		}
		
	}
		
		
		
		public static void WhileContinue() {
		//Continue Example
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
	
		}	
		
		
		
		
		
		//JAVA ARRAY
		
		
		public static void arr() {
			
		//	Access the Elements of an Array		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		// Outputs Volvo
		}
		
		
		
		public static void arra() {
			
		   //Change an Array Element
			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			cars[0] = "Opel";
			System.out.println(cars[1]);
			// Now outputs Opel instead of Volvo
		}
		
		
		
		public static void lenthg() {
			
			//Array Length
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars.length);
		// Outputs 4
		}
		
		
		public static void loop() {
			
			//Loop Through an Array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
	}
		
		
		public static void forEach() {
			//Array with For-Each
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}

	}
		
		
		
		
		
		//MULTIDIMENSIONAL ARRAY
		
		
		public static void MultiDi() {
		
			//Multidimensional Arrays
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
		}

		
		
		public static void multi() {
					
			//example..
			    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			    for (int i = 0; i < myNumbers.length; ++i) {
			      for(int j = 0; j < myNumbers[i].length; ++j) {
			        System.out.println(myNumbers[i][j]);
			      }
			    }
			  
		}
}


	

