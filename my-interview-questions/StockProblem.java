class StockProblem {
    private static boolean isSame = false;
    private static int id = 0;
    public static long solution(long[] prices) {
        long profit = 0;
        int length = prices.length;
        //      printSortedArray(prices);
        
       // Arrays.sort(prices);
        prices = doSorting(prices);
       System.out.println("After Sort");
      printSortedArray(prices); 
        System.out.println("isSame :"+isSame);
        if (id > 0) {
            profit = prices[id] - prices[0]; // Sell - Buy
            id = 0;
        }else {
                profit = prices[length - 1] - prices[0]; // Sell - Buy
        }
        
      //   System.out.println("Ganesh > profit " + profit);
        
        return profit;
            
    }
    
    private static void printSortedArray(long[] prices) {
         int length = prices.length;
        for (int i =0; i < length; i++) {
            System.out.print("," + prices[i]);
        }
        
    }
    
    private static long[] doSorting(long[] prices) {
        int length = prices.length;
        for (int i = 0; i< length;i++) {
            for (int j = i + 1; j<length; j++) {
                    if (prices[i] > prices[j]) {
                        long temp = prices[i];
                        prices[i] = prices[j];
                        prices[j] = temp;
                    } else if (prices[i] == prices[j]) {
                        id = i;
                        //isSame = true;
                    }
                
            }
        }
        
        return prices;
    }
}

