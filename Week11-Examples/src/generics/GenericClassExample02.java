package generics;

public class GenericClassExample02 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Merhaba Dünya!");
        System.out.println("Mesaj: " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(4);
        System.out.println("Integer değeri : " + integerBox.getItem());
    }
}
