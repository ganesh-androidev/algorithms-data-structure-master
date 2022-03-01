// Use Priority Queue  / K max value / dynamic 
class FindLargeNum {
    
    public static int findKLargest(int[] array, int k) {
        int length = array.length;
        int result = 0;
        int first = 0;
        int second = 0;
        int loop = 0;

        if (length == 0) return result;
        while ( loop < k) {

        for (int i=0;i<length;i++) {
            for (int j= i+1 ;j < length; j++) {
                    if (array[i] < array[j] 
                        && result < array[j] && first != array[j]) {
                        result = array[j];
                        System.out.println("Result J " + result);
                    } else {
                        if (result < array[i] && first != array[i]) {
                            result = array[i];
                            System.out.println("Result i " + result);
                       }
                    }
            }
        }
       if ( first <=0 ) {
            first = result;
       } else {
            second = result;
       }
        loop ++;
        result = 0;
        // Find Second one 
        System.out.println(" Final 2 K values are : first [ " +  first + " ] Seconf [ " + second + " ]");
        }
        return result;
    }


    public static void main (String arg[]) {
        int array[] = {12,3,6,15,4,9};
        int k = 2;
        int output = findKLargest(array, k);
        System.out.println(" Final K Value is :" + output);
    }
}
