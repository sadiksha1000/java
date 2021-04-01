//Given array of contiguous prime number, return array with missing element in between.
import java.util.*;
class Prime{
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,11,17,23};
		int flag=0;
		ArrayList<Integer> PrimeNumbers=new ArrayList<Integer>();
		int loop=arr[arr.length-1]-arr[0];
		for (int i = 0; i <= loop; i++) {
			 
            // Skip 0 and 1 as they are neither prime nor composite
            if (i == 1 || i == 0) {
            	 continue;	
            }
               
 
            // flag variable to tell
            // if i is prime or not
            flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // flag = 0 means i is not prime
            if (flag == 1) {
            	PrimeNumbers.add(i);
            }
        }
		System.out.println("All Prime Numbers between 1 and 23: "+PrimeNumbers);
		System.out.println("Given Input : ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] +" ");
		}
		System.out.println();
		System.out.println("Missing prime numbers:");
		 int misPrime[]=FindMissingPrimeNumbers(PrimeNumbers,arr);
		 for(int k=0;k<misPrime.length;k++) {
			 System.out.print(misPrime[k]+" ");
		 }
		 
	}
	
	//function to find missing prime numbers in the given input list
	public static int[] FindMissingPrimeNumbers(List<Integer> primeNumbers, int[] givenPrimeNumbers) {
        
        
        for(int i=0; i<givenPrimeNumbers.length; i++) {
            
            for(int j = 0; j<primeNumbers.size(); j++) {
 
                int currentNumber = givenPrimeNumbers[i];
                if(primeNumbers.contains(currentNumber)) {
                    
                    int index = primeNumbers.indexOf(currentNumber);
                    primeNumbers.remove(index);
                    
                } 
            }
        } 
        
        int[] missingPrimeNumbers = new int[primeNumbers.size()];
        for(int i = 0; i<missingPrimeNumbers.length; i++) {
            
            missingPrimeNumbers[i] = primeNumbers.get(i);
            
        } 
        
        return missingPrimeNumbers;
        
    } 
}
