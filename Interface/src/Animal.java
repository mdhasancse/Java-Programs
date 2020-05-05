
public interface Animal
{
	public void animalSound();      // In the interface ,we will alwys implements next class ,..u see below
	public void sleep();
	public void people();
}
								// interface is copletely abstrack hota hai ;

class goat implements Animal
{
	
	public void animalSound()
	{
		
		System.out.println("the goat is always eat grass");
	}
	
	public void sleep()
	{
		
		System.out.println("so gya sab");
	}
	
	
	public void people()
	{
		
		System.out.println("some poeple vary harami hota hai  ");	
	}
}


class MyMainClass
{
	public static void main(String[] args)
	{
		goat myGoat = new goat();
		myGoat.animalSound();
		myGoat.sleep();
		myGoat.people();
		
	}
	
}