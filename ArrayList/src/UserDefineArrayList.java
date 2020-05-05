
//public class UserDefineArrayList 

import java.util.ArrayList;

class Animal

{
	
	public String Name;

}

class MyAnimalClass
{
	public static void main(String[] args)
	{
		
		ArrayList<Animal> MyAnimal = new ArrayList<Animal>();
		
		Animal animalObj1 = new Animal() ;
		animalObj1.Name = "bakri";
		
		Animal animalObj2 = new Animal() ;
		animalObj2.Name = "bakra";
		
		Animal animalObj3 = new Animal() ;
		animalObj3.Name = "boto";
		
		Animal animalObj4 = new Animal() ;
		animalObj4.Name = "khassi";
		
		Animal animalObj5 = new Animal() ;
		animalObj5.Name = "pathhi";
		
		
		
		MyAnimal.add(animalObj1);
		MyAnimal.add(animalObj2);
		MyAnimal.add(animalObj3);
		MyAnimal.add(animalObj4);
		MyAnimal.add(animalObj5);
		
		for(int i=0;i<MyAnimal.size();i++)
		{
			System.out.println(MyAnimal.get(i).Name);
		}
		
	}
	
}

