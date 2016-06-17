package customFurnish;

import java.util.Arrays;

public class quest3 {
	
	public static int[] max_3(int[] arr)
	{
		int[] a=new int[3];
		int i=arr[0],j=Integer.MIN_VALUE,k=Integer.MIN_VALUE;
		for(int x=1;x<arr.length;x++)
		{
			if(i<arr[x])
			{
				k=j;
				j=i;
				i=arr[x];
			}
			else if(j<arr[x])
			{
				k=j;
				j=arr[x];
			}
			else if(k<arr[x])
			{
				k=arr[x];
			}
		}
		a[0]=i;
		a[1]=j;
		a[2]=k;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,0,5,15,2,13,7,10};
		int[] ans=max_3(arr);
		System.out.println(Arrays.toString(ans));

	}

}
