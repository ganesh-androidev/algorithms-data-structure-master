xte// Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class CommonItemInArray {


    static boolean findContainsCommonItem(char[] arr1, char[] arr2) {
      if(arr1 != null && arr2 != null) {
        for (int i = 0;i < arr1.length; i++) {
            for (int j=0;j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(" ** Command Item FOUND ** ");
                    return true;
                }
            }
        }

      }
      System.out.println(" ** NO ** Command Item FOUND ** ");
      return false;
    } 
   


    static void findContainsCharacterArray (Character[] charArray1, Character[] charArray2) {
        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();
        list1.addAll(Arrays.asList(charArray1));
        list2.addAll(Arrays.asList(charArray2));

        System.out.println("** ArrayList ** List 1 "+ list1);
        System.out.println("** ArrayList ** List 2 "+ list2);

        boolean isItemFound = list2.contains(list1);
        
        if (isItemFound) {
            System.out.println("** ArrayList ** Command Item FOUND ** ");
        } else {
            System.out.println(" ** ArrayList ** No ** Command Item FOUND ** ");
        }
        
    }

    public static void main(String[] arg) {
        final char[] array1 = {'a','b','c','x'};
        final char[] array2 = {'z','y','i'};

        final Character[] charArray1 = {'a','b','c'};
        final Character[] charArray2  = {'x','y','c'};

        findContainsCommonItem (array1, array2);
        findContainsCharacterArray (charArray1, charArray2);
        
    }
}
