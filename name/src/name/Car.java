package name;

class Vehicle 
{
	  protected String brand = "Ford";
	  public void honk() 
	  {
	    System.out.println("Tuut, tuut!");
	  }
}

class bike extends Vehicle
{
	public void Kick() 
	{
		System.out.println("kicking the bar!");
		
	}
}

class ricksha extends Vehicle
{
	public void DoublePaddle()
	{
		System.out.println("paddling the ricksha!");

	}
}

class Auto extends Vehicle
{
	public void handle() 
	{
		System.out.println("kicking the Auto!");
	}
}


class bicycle extends Vehicle
{
	public void paddle() 
	{
		System.out.println("paddling the cycle!");
		
	}
}


class Car extends Vehicle 
{
	  private String modelName = "Mustang";
	  
	  public static void main(String[] args) 
	  {
		  	Car myFastCar = new Car();
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		    
		    bicycle bc=new bicycle();
		    System.out.println("cycle brand: " + bc.brand);
		    bc.honk();
		    bc.paddle();
		    
		    Auto gari = new Auto();
		    System.out.println("Auto brand: " + bc.brand);
		    gari.handle();
		    gari.honk();
		    
		    
		    
	  }
}
