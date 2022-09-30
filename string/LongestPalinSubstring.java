// Java implementation of O(n^2)
// time and O(1) space method
// to find the longest palindromic substring
public class LongestPalinSubstring {
   
    // This function prints the
    // longest palindrome substring
    // (LPS) of str[]. It also
    // returns the length of the
    // longest palindrome
    static int longestPalSubstr(String str)
    {
        int n = str.length(); // calculcharAting size of string
        if (n < 2)
            return n; // if string is empty then size will be 0.
                  // if n==1 then, answer will be 1(single
                  // character will always palindrome)
 
        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && str.charAt(high) == str.charAt(i)) //increment 'high'                                  
                high++;
       
            while ( low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'                   
                low--;
       
            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
                  low--;
                high++;
        }
 
        int length = high - low - 1;
        if (maxLength < length){
            maxLength = length;
            start=low+1;
        }
    }   
    System.out.print("Longest palindrome substring is: ");
    System.out.println(str.substring(start, start + maxLength ));
    return maxLength;
       
 }

    private static void printLongestPaliSubString(String str) {
        int length = str.length();
        char[] c = new char[length];
        String result= "";
        int resultLength = 0;

        for(int i=0; i< length; i++) {
            for(int j = length-1; j>1 ;j--) {
            System.out.println(" c[i] = "+ str.charAt(i) + " c[j] = " + str.charAt(j) + "resultLength : " +resultLength);
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.substring(i,j+1);
                    resultLength = Math.max(result.length(),resultLength);
                    System.out.println( "Result Substring : " + resultLength);
                    boolean isPali = isPalindrome(result);
                    System.out.println( "is Palindrom  " + isPali);
                    break;
                }
            }
        }


        System.out.println("Longest Pali Substring is : " +result + " Length" + resultLength);
    }

    private static boolean isPalindrome(String s) {
        System.out.println(" Do Palindrome >> " +s);
            if (s.length() <= 2) return false;
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    // Driver program to test above function
    public static void main(String[] args)
    {
 
        String str = "rnononontasat";
//        System.out.println("Length is: "
  //                         + longestPalSubstr(str));
        printLongestPaliSubString(str);
    }
}
