package algorithm;

public class MaxNumber02 {
    public static void main(String[] args) {
        int n1 = 100, n2 = 5, n3 = 200;

        Math.max(n1, n2);
        int max = Math.max(n1, n2);
        max = Math.max(max, n3);
        System.out.println("en buyuk sayı : " + max);
    }
}

