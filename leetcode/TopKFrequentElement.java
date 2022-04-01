import java.util.*;

class TopKFrequentElement {

     static int[] findTopKFrequentElement(int[] array, int k) {
        int length = array.length;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
        
        // Add the distinct elements to hashMap and calculate number of occurance in value
        for(int i=0;i<length;i++) {
            hashMap.put(array[i], 
                        hashMap.getOrDefault(array[i], 0) + 1);

            System.out.println(hashMap.get(array[i]));
        }

        System.out.println("unSorted List " + Arrays.asList(hashMap));

        // Create a list from HashMap
        List<Map.Entry<Integer,Integer>> list = 
                new ArrayList<Map.Entry<Integer,Integer>>(hashMap.entrySet());

        // Sort the Collection List
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>()
                {   
                    public int compare(
                            Map.Entry<Integer,Integer> o1,
                            Map.Entry<Integer, Integer> o2) {
                           // System.out.println("o1 value : "+o1.getValue());
                           // System.out.println("o2 value : "+o2.getValue());
                            return o2.getValue().compareTo(o1.getValue());
                    }
                });

        System.out.println( "Sorted List : " + Arrays.asList(list));

        for(int i=0;i<k;i++) {
            System.out.println(list.get(i).getKey());
        }
        return null;
     }


    public static void main(String arg[]) {
        int[] array = {1,3,1,1,2,2,3,4,3,4,4,4,4};
        //int[] array = {1};
        int k =2;

        findTopKFrequentElement(array, k);


    }
}
