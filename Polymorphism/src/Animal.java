
public class Animal 
{
	public void animalSound()
	{
		System.out.println("the Animal makes a sound");
	}

}

 class pig extends  Animal
{	
	public void animalSound()
	{
		System.out.println("the pig says:wee wee");

	}
}
 

 class dog extends  Animal
{	
	public void animalSound()
	{
		System.out.println("the dog says:bow woww" );

	}
}
 
 //main funx=ction
 class myMainClass
 {
	 public static void main(String[] rgs)
	 {
		 Animal myAnimal = new Animal();
		 Animal	myPig = new pig();
		 Animal mydog = new dog();
		 myAnimal.animalSound();
		 myPig.animalSound();
		 mydog.animalSound();
	 }
  }
 
 

