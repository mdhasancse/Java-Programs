import java.util.HashMap ;

class MyMapClass
{
	public static void main(String[] args)
	{
		HashMap<String,String> CapitalCitis = new HashMap<String,String>();
		
		
		
		CapitalCitis.put("India","Delhi");
		CapitalCitis.put("England","londin");
		CapitalCitis.put("Germany","berline");
		CapitalCitis.put("Norway","Oslo");
		CapitalCitis.put("USA","Washington DC");
		
		  for (String i : CapitalCitis.keySet())
		  {
			  System.out.println("key: " + i + " value: " + CapitalCitis.get(i));
			  
			  /* we also can write
			     System.out.println(capitalCities);
						     
			    for (String i : capitalCities.values()) 
			    {
			      System.out.println(i);
			    }		   */
			  
		    }
	 }
}
	



/*
 Access an Item
 
 uae this:-  capitalCities.get("England");
 
capitalCities.put("Norway", "Oslo");
capitalCities.put("USA", "Washington DC");
System.out.println(capitalCities.get("England"));  
  
 */


/*
 Remove an Item

uae this:-apitalCities.remove("England");

capitalCities.put("USA", "Washington DC");
capitalCities.remove("England");
System.out.println(capitalCities);
 
 */


/*
 		Clear()
uae this:- capitalCities.clear(); 
capitalCities.put("USA", "Washington DC");
capitalCities.clear();
System.out.println(capitalCities); 
 */

/*
 	HashMap Size
 	
 uae this:- capitalCities.size();	
 
capitalCities.put("Norway", "Oslo");
capitalCities.put("USA", "Washington DC");
System.out.println(capitalCities.size());
 
 */


/*
 		For Loop
 // Print keys and values
for (String i : capitalCities.keySet()) {
  System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
 
 */



