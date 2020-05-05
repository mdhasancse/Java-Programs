// Abstract class
public abstract class Animal 
{
	  // Abstract method (does not have a body)
	  public abstract void animalSound();		//it is not completly abstact
	  // Regular method
	  public void sleep()					// kye ke isme abstract me hi implement kr diya hai 
	  {
		  System.out.println("Zzz");
	  }
}

// Subclass (inherit from Animal)
class Pig extends Animal 
{
	public  void animalSound()
	{
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
    }
}

class MyMainClass
{
	public static void main(String[] args)
    {
	    Pig myPig = new Pig(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
    }
}

