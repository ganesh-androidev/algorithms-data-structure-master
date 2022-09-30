class MinStack {

    static int id = -1;
    static int[] data = new int[10];
    static int min = Integer.MAX_VALUE;

    private static void push(int x) {  
        data[++id] = x;
    }

    private static void pop() {
        id--;
    }

    private static int peek() {
        return data[id];
    }

    private static int getMin() {
        min = Integer.MAX_VALUE;
        for(int i=0; i<=id; i++) {
            min = Math.min(min, data[i]);
        }
        return min;
    }

    public static void main(String[] str) {
         push(50);
         push(60);
         push(30);
         push(20);
         push(10);
         push(110);
         push(120);

        System.out.println(" getMin Result After Push : " + getMin() + " : peek " + peek());
        pop();
        System.out.println(" getMin Result After Pop : " + getMin() + ": peek :" + peek());
    }
}
