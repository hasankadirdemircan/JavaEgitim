package generics;

public class VarArgsExample01 {
    public static <T> void printArray(T... items) {
        for(T item : items) {
            System.out.println("item : " + item);
        }
    }
    public static void main(String[] args) {
        System.out.println("String dizisi : ");
        System.out.println("VarArgs");
        printArray("name1", "name2", "name3");
        printArray("name1", "name2", "name3", "name4");

        printArray(1,2,3,4);
        printArray(1,2,3,678,9,0,5);

        printArray(1.5, 2.3, 3.3);

       // printArray2("name1", "name2", "name3"); //Expected 2 arguments but found 3
        System.out.println("Normal Method");
        printArray2("name1", "name2");
    }

    public static <T> void printArray2(T data1, T data2) {
        System.out.println("data1 : " + data1 + " data2 : " + data2);
    }
}
