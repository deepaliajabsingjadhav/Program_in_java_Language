// Singly linked list creation in java
import java.lang.*;
import java.util.*;

class Bubble
{
	public void Sort(int arr[])
	{
		int i = 0, j = 0 , temp = 0;

		for(i = 0; i < arr.length; i++)
		{
			for(j = 0; j< arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the values");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}

		Bubble bobj = new Bubble();
		bobj.Sort(arr);

		System.out.println("Array after sorting : ");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
