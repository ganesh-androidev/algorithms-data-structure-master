import java.util.*;

class FindFirstRecurringNumber {

    private static void findFirstRecurringNumber(int[] array) {
        int length = array.length;
        int value = 0;

        for (int i=0; i< length; i++) {
            value = array[i];
            for (int j= i +1; j < length; j++) {
//                    System.out.println("Value # " + value);
                if (array[j] == value) {
                    System.out.println(" $$ Nested Loop $$ First Recursive Value # " + value);
                    return;
                }
            }
        }
     System.out.println("First Recursive # undefined");
    }
    
    private static void findFirstRecurringNumberInHashMap(int[] array) {
        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for (int i=0;i < array.length;i++) {
            maps.put(i,array[i]);
         }
            Iterator it = maps.entrySet().iterator();
            while(it.hasNext()) {
                // Map.Entry pair1 = (Map.Entry)it.next();
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
               if (maps.containsValue(pair.getValue())) {
                   System.out.println("** HashMap ** First Recursive is " + pair.getValue());
                   return;
                }
            }
            /*
            }
            System.out.println("[ " + array[i] + "]"); 
            */
       // }
        System.out.println("First Recursive # undefined");
    }

    private static void findFirstRecurringNumberUserHasSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< array.length;i++) {
            if(!set.add(array[i])) { // HashSet wont Allow Duplicate Values
                System.out.println(" ## HashSet ## First Recursive Value # " + array[i]);
                return;
            }
        }
        System.out.println("First Recursive # undefined");
    }
    public static void main(String arg[]){
        // Given an array = [2,5,1,2,3,5,1,2,4]
        // Find the first recurring number in an array
        // int[] array = {2,5,1,2,3,5,1,2,4};
         int[] array = {0,3,5,15,12,2,5,1,32,4};
        // int[] array = {1,2,5,2,1,3,5,1,2,4};
        // int[] array = {1,2,3,4,5,6};
        // int[] array = {15,125,4,0,3,5,1,2,4};

        findFirstRecurringNumber(array);
        findFirstRecurringNumberInHashMap(array);
        findFirstRecurringNumberUserHasSet(array);
    }
}
