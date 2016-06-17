package customFurnish;

import java.util.Arrays;

public class rotateArray {
	
	public static void swap(int[] arr,int l,int h)
	{
		while(l<h)
		{
			int t=arr[l];
			arr[l]=arr[h];
			arr[h]=t;
			l++;
			h--;
		}
	}

	public static void rotateLeft(int[] arr,int x)
	{
		swap(arr,0,x-1);
		swap(arr,x,arr.length-1);
		swap(arr,0,arr.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6};
		rotateLeft(arr,2);
		System.out.println(Arrays.toString(arr));

	}

}
