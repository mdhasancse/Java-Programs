
public class MyExceptionClass 
{
	public static void main(String[] args)
	{
		try
		{
			int[] Arraynumber={1,2,3,4};
			
			System.out.println(Arraynumber[10]);  //u didnt assign eleven value in an array so it didnt execute 
			
			
		}
		catch (Exception e) 
		{
			System.out.println("bhai S.O.P me tumne chutyaapa kr rakha h to kaise run hoga ");
		}
	
	}
}
