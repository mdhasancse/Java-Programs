import java.io.File; 

class getFileInfo
{
	public static void main(String[] args)
	{
		File MyInfo = new File("C:\\\\Users\\\\noora\\\\Documents\\\\HasanCreatedFile.txt");
		
		if(MyInfo.exists())
		{
			System.out.println("File name: "+MyInfo.getName());
			System.out.println("Absolute File: "+MyInfo.getAbsoluteFile());
			System.out.println("Writeable: "+MyInfo.canWrite());
			System.out.println("Readable: "+MyInfo.canRead());
			System.out.println("File size in byte: "+MyInfo.length());
			
		}
		else
		{
			System.out.println("File does not exist");
			
		}
	}
}

