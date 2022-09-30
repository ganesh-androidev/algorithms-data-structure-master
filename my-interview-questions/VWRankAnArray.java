/*Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.

int array[] = {5,4,3,6,2};

sorted_array[] = {2,3,4,5,6}

o/p = {4,3,2,5,1};


Eg : {2,3,4,5,6} =  
*/
import java.util.Arrays;

public class  VWRankAnArray {


    private static int[] doRanking(int[] arr) {
        int length = arr.length;
        int[] sorted_array = new int[length];
      

        for (int i=0;i< length;i++) {
             sorted_array[i] = arr[i];
        }

       /* int temp = 0;
        for (int i=0;i< length;i++) {
            for(int j = i+1; j< length; j++) {
                    if (sorted_array[i] > sorted_array[j]) {
                     temp = sorted_array[i];
                     sorted_array[i] = sorted_array[j];
                     sorted_array[j] = temp;
                     
                    } 
                
            }
            
      
        } */
        
        Arrays.sort(sorted_array);
        System.out.println (" \n SortedArray : ");
        printArray(sorted_array);
        // Sorted Arr = 2,3,4,5,6
        
        for(int i=0; i< length;i++) {
            for(int j = 0; j< length; j++) {
                if(arr[i] == sorted_array[j]) {
                    arr[i] = j + 1;            
                }
            }
        }
        
        System.out.println (" \n Ranked Array : ");
        printArray(arr);
        return arr;
        
    }

    private static void printArray(int[] arr) {

        for(int i = 0 ; i< arr.length;i++) {
            System.out.print(arr[i] + ",");
        }

    }




    public static void main(String arg[]) {
        int[] array = {5,400,3,-16,-111,20};
        
        System.out.println ("Input Array : " );
        printArray(array);
        doRanking(array);
    }
}

