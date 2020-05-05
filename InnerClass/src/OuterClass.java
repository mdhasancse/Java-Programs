
class OuterClass
{
	int x=20;
	class InnerClass
	{
		int y=10;	
	}
}

class myMainClass
{
	public static void main(String[]args)
	{
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println("sum="+(myInner.y + myOuter.x)* myOuter.x);		
		
	}
}
