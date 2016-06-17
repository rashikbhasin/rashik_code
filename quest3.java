package customFurnish;

import java.util.Arrays;

public class quest3 {
	
	public static void sort(int[] a,int l,int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			sort(a,l,m);
			sort(a,m+1,h);
			merge(a,l,m,h);
		}
	}

	public static void merge(int[] a,int l,int m,int h)
	{
		int i=l,j=m+1;
		int[] b=new int[h-l+1];
		int k=0;
		while(i<=m && j<=h)
		{
			if(a[i]<=a[j])
			{
				b[k++]=a[i++];
			}
			else
			{
				b[k++]=a[j++];
			}
		}
		while(i<=m)
		{
			b[k++]=a[i++];
		}
		while(j<=h)
		{
			b[k++]=a[j++];
		}
		j=l;
		for(i=0;i<b.length;i++)
		{
			a[j++]=b[i];
		}
	}
	
	public static int[] max_3(int[] arr)
	{
		int[] a=new int[3];
		sort(arr,0,arr.length-1);
		a[0]=arr[arr.length-1];
		a[1]=arr[arr.length-2];
		a[2]=arr[arr.length-3];
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={8,0,5,15,2,13,7,10};
		int[] ans=max_3(arr);
		System.out.println(Arrays.toString(ans));

	}

}
