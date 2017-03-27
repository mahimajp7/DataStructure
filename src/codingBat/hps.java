package codingBat;

import java.util.Random;
 
public class hps
{
    private static int[] a;
    private static int   n;
    private static int   left;
    private static int   right;
    private static int   largest;
 
    public static void buildheap(int[] a)
    {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--)
        {
            maxheap(a, i);
        }
    }
 
    //Heapify function to percolate up if the number is larger than the parent
    
    public static void maxheap(int[] a, int i)
    {
        left = 2 * i;
        right = 2 * i + 1;
        if (left <= n && a[left] > a[i])
        {
            largest = left;
        } else
        {
            largest = i;
        }
 
        if (right <= n && a[right] > a[largest])
        {
            largest = right;
        }
        if (largest != i)
        {
            swap(i, largest);
            maxheap(a, largest);
        }
    }
 
    public static void swap(int i, int j)  //Function to swap
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    //Heap sort method
    
    public static void sort(int[] a0)
    {
        a = a0;
        buildheap(a);
 
        for (int i = n; i > 0; i--)
        {
            swap(0, i);
            n = n - 1;
            maxheap(a, 0);
        }
      
    }
    
    //Function to display the array after heapify operation but before the sort.
    public static void beforesort(int[] a1){
    	a = a1;
    	buildheap(a);
    	for (int i = n; i > 0; i--)
        {
           
            maxheap(a, 0);
        }
    }
    	
    public static void main(String[] args)
    {
        //int N = 17;
        int[] myarray = {13, 51, 2, 78, 44, 48, 33, 39, 29, 41, 30, 63, 62, 15, 72,53, 21};
       // Random random = new Random();
 
        //System.out.println("Heap Sort Test");
 
       
        
        System.out.println("Part 1 - to print the array before and after heapify\n");
 
        System.out.println("The original sequence before heapify is: ");
        for (int i = 0; i < myarray.length; i++)
            System.out.print(myarray[i] + " ");
        	System.out.println("\n");
        
        //Calling a function to print the array once the max heap is done
       
        beforesort(myarray);
        System.out.println("After heapify , the array looks like this: ");
        for (int i = 0; i < myarray.length; i++)
            System.out.print(myarray[i] + " ");
        System.out.println("\n");
        
        
        //Input to the heap sort method after heapify
        System.out.println("\nPart 2 - to print the array before and after heap sort");
        
        beforesort(myarray);
        System.out.println("\nBefore Heap sorting : ");
        for (int i = 0; i < myarray.length; i++)
            System.out.print(myarray[i] + " ");
        System.out.println("\n");
        
        //Calling heap sort function
        sort(myarray);
        System.out.println("The sorted sequence is: ");
        for (int i = 0; i < myarray.length; i++)
            System.out.print(myarray[i] + " ");
        
    }
    
}