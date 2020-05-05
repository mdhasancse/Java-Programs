public class array 

{

	public static void main(String[] args)
	{
		int[] L= {30,45,48,59,60,400,10000};
		
		int[] R= {5,32,67,69,10000};
		
		
		int[] res = merge(L,L.length,R,R.length);	
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println("result of array :"+res[i]);
		}
		
	}

	public static int[] merge(int[] L,int Lsize,int[] R,int Rsize)
	{
		int i=0,j=0,k=0;
		int n = Lsize+Rsize-2;
		int[] M = new int[n];
		while(k<=n-1)
		{
			if(L[i]<R[j])
			{
				M[k]=L[i];
				i++;
				
			}
			else
			{
				M[k]=R[j];
				j++;
				
			}
			k++;				
		}
		
		return M;
	}
}

	
	



