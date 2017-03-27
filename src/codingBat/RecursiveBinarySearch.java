package codingBat;

import java.util.Scanner;

public class RecursiveBinarySearch 
{

	public static void main(String[] args)
	
	{
		
			System.out.println("Considering 16 digits...\n");
		    int arr[] = {11, 12, 13, 14, 15, 16, 17, 18 ,19, 20, 21, 22, 23, 24, 25, 26};
		    Scanner sc = new Scanner(System.in);
		    System.out .println("Enter the number to be searched in array: \n");
			int key = sc.nextInt();
		    
		    int found = recBinarySearch1(arr, key, 0, arr.length - 1);
		 
		    if (found > -1)
		    {
		      System.out.println ("Item found at index position: " + found);
		    }
		    else
		    {
		      System.out.println("Item not found");
		    }
		
		  }
		 
		static int recBinarySearch1(int arr[], int key, int low, int high)
		{
		  int mid;
		  if (high < low)
		  {
		    return -1;
		  }
		 
		  mid = (low + high) / 2; 
		 
		  if (arr[mid] < key)
		    return recBinarySearch1(arr, key, mid + 1, high);
		  else if (arr[mid] > key)
		    return recBinarySearch1(arr, key, low, mid - 1);
		  else
		    return mid;
		}

	
	}


