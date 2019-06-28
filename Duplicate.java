import java.io.*;
import java.util.*;
class Duplicate
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[]=new int[a];
		int count=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		int res[]=new int[count];
		int k=0,temp;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]==arr[j])
				{
					res[k]=arr[i];
					k++;
				}
			}
		}
		if(count>0)
		{
			for(int i=0;i<count;i++)
			{
				for(int j=i+1;j<count;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=	arr[j];
						arr[j]=arr[i];
					}
				}
			}
			for(int i=0;i<count;i++)
			{
				System.out.print(res[i]+" ");
			}
		}
		else
		{
			System.out.println("unique");
		}
	} 
}
