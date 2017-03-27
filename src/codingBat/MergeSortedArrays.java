package codingBat;

public class MergeSortedArrays {

	public static int[] merge(int [] a, int [] b){
		int [] finalArray = new int [a.length + b.length];
		
		int i=0 , j=0, k=0;
		while (i < a.length && j < b.length)
	    {
		
		if(a[i]<b[j]){
			finalArray[k] = a[i];
			i++;
			
		}
		
		else{
			finalArray[k]=b[j];
			j++;
		}
		
		k++;
	}
		while(i<a.length ){
			
			finalArray[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length){
			
			finalArray[k] = b[j];
			j++;
			k++;
		}
		
		
		return finalArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myarr1 = {5,10,15};
		int [] myarr2 = {2,4,6,8};
		
		int [] finalArray = merge(myarr1,myarr2);
		for(int m = 0; m<finalArray.length; m++){
			System.out.print(finalArray[m]+" ");
		}
		
		

	}

}
