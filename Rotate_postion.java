package array;

public class Rotate_postion {
	static int [] leftRotate (int [] arr, int k)
	
	{
		int n=arr.length;
		k=k%n;
		int[] result =new int[n];
	     int index=0;
		for(int i=k;i<n;i++)
		{
			result [index ++]=arr[i];
			
		}
		for(int i=0;i<k;i++)
		{
			result [index ++]=arr[i];
			
		}
		return result;

	}
	

	public static void main(String[] args) {
		  int[] arr = {5, 4, 3, 2, 1};
	        int k = 2;

	        int[] rotated = leftRotate(arr, k);

	        for (int i : rotated) {
	            System.out.print(i + " ");
	        }
		

	}

}
