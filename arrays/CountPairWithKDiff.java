// A sorting based Java program to
// count pairs with difference k
import java.util.*;
 
class CountPairWithKDiff {
 
/* Returns count of pairs with
difference k in arr[] of size n. */
static int countPairsWithDiffK(int arr[], int n,
                                          int k)
{
    int count = 0;
    Arrays.sort(arr); // Sort array elements
 
    int l = 0;
    int r = 0;
    while(r < n)
    {
            System.out.println("Debug : r :" + r + " : l :" + l);
            System.out.println("Debug : {" + arr[r] + "," + arr[l] + "}");
        if(arr[r] - arr[l] == k)
        {
            System.out.println("{" + arr[r] + "," + arr[l] + "}");
            count++;
            l++;
            r++;
        }
        else if(arr[r] - arr[l] > k)
            l++;
        else // arr[r] - arr[l] < sum
            r++;
    }
    return count;
}
 
// Driver program to test above function
public static void main(String[] args)
{
    int arr[] = {1,7,5,9,2,12,3};
    int n = arr.length;
    int k = 2;
    System.out.println("Count of pairs with given diff is " +
                        countPairsWithDiffK(arr, n, k));
}
}
 
// This code is contributed by Prerna Saini
