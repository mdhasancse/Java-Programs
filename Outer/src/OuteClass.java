

//Access Outer Class From Inner Class

public class OuteClass 
{
	  int x = 10;

	  class InnerClass
	  {
	      public int myInnerMethod() 
	      {
	      return x;
	     }
	  }
}

class MyMainClass {
  public static void main(String args[]) {
	  OuteClass myOuter = new OuteClass();
	  OuteClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

	// Outputs 10
