import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile
{
	public static void main(String[] args)
	{
		try
			{ 
			File MyNewFile = new File("C:\\Users\\noora\\Desktop\\vitrix\\ReadFile\\src.txt");
			Scanner MyReader = new Scanner(MyNewFile);
			
			while(MyReader.hasNextLine())
			{
				String data = MyReader.nextLine();
				System.out.println(data);
			
			}
			MyReader.close();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}