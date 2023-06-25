package methods;

public class ReverseArrayReturnTypeMethod {
    public static void main(String[] args) {
        String username = "bilgeadam";
        username.concat("aaa");
        System.out.println(username);
        int[] age = {12, 4, 5, 2, 5, 7};
        reverseArray(age);

        for(int element: age) {
            System.out.println(element);
        }

    }

    static int[] reverseArray(int[] numbers) {
        int temp;
        for (int i=0; i<numbers.length/2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
        }
        return numbers;
    }
}
