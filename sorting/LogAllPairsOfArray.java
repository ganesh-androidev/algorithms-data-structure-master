class LogAllPairsOfArray {
// Log all pairs of arrya
// array = [1,2,3,4,5];
// O/P = 1,2 | 1,3, | 1,4 | 1,5 etc.,


   public static void main(String[] arg) {
    String[] array = {"a","b","c"};
    int[] numArray = {1,2,3,4,5};
    int sum = 0;
    for (int i=0; i< array.length;i++) {
        for (int j=0; j< array.length;j++) {
            System.out.println("[" + array[i] + "," + array[j] + "]");
        }
    }

    for (int i=0;i< numArray.length;i++) {
        for (int j=0; j< numArray.length;j++) {
            System.out.print("pair [" + numArray[i] + "," + numArray[j] + "]");
            sum = numArray[i] + numArray[j];
            System.out.println(" Sum [" + sum + "]");
        }
    }

    for (int i : numArray) {
        System.out.println("numArray i :"+i);
    }

   }
}
