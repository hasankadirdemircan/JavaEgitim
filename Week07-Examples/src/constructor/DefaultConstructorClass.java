package constructor;

public class DefaultConstructorClass {
    int [] number;
    boolean isPremium;

    DefaultConstructorClass() {
        number = new int[30];
        isPremium = true;
    }

    public static void main(String[] args) {
        DefaultConstructorClass defaultConstructor = new DefaultConstructorClass();
        System.out.println(defaultConstructor.isPremium);

        System.out.println(defaultConstructor.number.length);
        for(int number : defaultConstructor.number) {
            System.out.println(number);
        }
    }
}
