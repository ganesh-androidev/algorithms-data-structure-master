class PrintKDifference {

    public static void main(String str[]) {
        int[] array = {1,7,5,9,2,12,3};
        int k = 2;
        int length = array.length;
        
        for(int i=0;i<length;i++) {
            for (int j = 1; j < length; j++) {
            int sum = array[i] - array[j];
//            System.out.println(i + " :" + " j" + j + " sum > "  + sum);
            if(Math.abs(sum) == k) {
                System.out.println(" ( " + array[i] + " ," + array[j] + " )" );
            }
            }
        }
    }
}
