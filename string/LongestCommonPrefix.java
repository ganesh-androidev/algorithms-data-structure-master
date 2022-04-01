import java.util.Arrays;
import java.util.ArrayList;

class LongestCommonPrefix {

   static String doLongestCommonPrefix(String[] strArray) {
        int length = strArray.length;
        ArrayList<String> list = new ArrayList<String>();

        Arrays.sort(strArray);

        for(String value: strArray) {
            System.out.println(value);
        }
        
        for(int j=0; j < length - 1; j++) {
            if ( j < length - 1 && strArray[j].charAt(0) == strArray[j+1].charAt(0)) {
                list.add(strArray[j]);
                list.add(strArray[j+1]);
                j++;
            }
        }

        for(String value: list) {
            System.out.println(value);
        }
        
       // Find Min
       int minStringSize = Math.min(strArray[0].length(), strArray[length-1].length());
        int i =0;
       while (i < minStringSize) {
            if (strArray[0].charAt(i) == strArray[length-1].charAt(i)) {
                    System.out.println(strArray[0].charAt(i));
                i++;
            } else {
                break;
            }
       }

       String prefix = strArray[0].substring(0,i);
       return prefix;
   }


    public static void main(String str[]) {
        String[] strArray = {"Hello","HelloWorld","Hell","Helliot","Hero","Zpple","Apple"};
        
        System.out.println("LongestCommonPrefix : " + doLongestCommonPrefix(strArray));
    }
}
