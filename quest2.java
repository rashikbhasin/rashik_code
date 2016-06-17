package customFurnish;

import java.util.Arrays;

public class quest2 {
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

	public static void rotateRight(int[] arr,int x)
	{
		int l=arr.length;
		swap(arr,0,l-1-x);
		swap(arr,l-x,l-1);
		swap(arr,0,l-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6};
		rotateRight(arr,4);
		System.out.println(Arrays.toString(arr));

	}

}
