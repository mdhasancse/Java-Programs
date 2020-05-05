import java.util.ArrayList;

public class sort 
{	
	int partition (int arr[],int j,int r)
	{
	
		int i = j-1;
		while(j<r)
		{
			if(arr[j]>=arr[r])
			{
				j++;
			}
			else
			{
				i++;
				int temp = arr[i];			//exchange arr[i] with arr[j]
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		i++;
		int temp = arr[i];			//exchange arr[i] with arr[r]
		arr[i] = arr[r];
		arr[r] = temp;
		return i;
	}

	int[] quickSort(int arr[], int firstIndex,int lastIndex)
	{
		if(firstIndex < lastIndex)
		{
			int q = partition(arr,firstIndex,  lastIndex);
			
			quickSort(arr, firstIndex, q-1);
			quickSort(arr, q+1, lastIndex);
			
		}
		
		return arr;
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] +" ");
			
		}
	}
	
	public static void main(String[] args)
	{
		
		 int arr[] = {2,4,7,12,1,23};
		 int n=arr.length;
		 sort MySort  = new sort();
		 MySort.quickSort(arr,0,n-1);
		 System.out.println("sorted array");
		 printArray(arr);
	}
}














