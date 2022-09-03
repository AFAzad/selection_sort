/* Problem Statement
Implement Selection Sort on a given array, and make it sorted.  */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner Iput = new Scanner(System.in);
        int n = Iput.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =Iput.nextInt();
        }
        slectionSort(arr, n);
	}
    private static void slectionSort(int []arr, int n){
        for(int i=0; i<n-1;i++){
            int minInex = i;
            for(int j=i+1 ;j<n ;j++){
                if(arr[j]<arr[minInex]){
                    minInex =j;
                }
            }
            int temp = arr[minInex];
            arr[minInex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}