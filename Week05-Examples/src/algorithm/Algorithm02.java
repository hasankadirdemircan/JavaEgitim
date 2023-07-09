package algorithm;

public class Algorithm02 {
    public static void main(String[] args) {
        int b = 60;
        int [] keyboards = {60, 50, 40};
        int [] drives = {12, 8, 5};

        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    private static int getMoneySpent(int [] keyboards, int [] drives, int b) {
        int [] prices = getPrices(keyboards, drives);
        int spent = -1;
        for (int price : prices) {
            if(price < b && spent < price) {
                spent = price;
            }
        }
        return spent;
    }

    private static int[] getPrices(int [] keyboard, int [] drives) {
        int [] prices = new int[keyboard.length * drives.length];
        int indexCount = 0;
        for(int i=0; i<keyboard.length; i++) {
            for(int j=0; j<drives.length; j++) {
                prices[indexCount] = keyboard[i] + drives[j];
                indexCount++;
            }
        }
     return prices;
    }
}
