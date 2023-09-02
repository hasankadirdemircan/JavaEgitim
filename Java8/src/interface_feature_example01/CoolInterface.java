package interface_feature_example01;

public interface CoolInterface {
    public static void staticMethod() {
        System.out.println("static method.");
     //   staticTestMethod();
    }


    private static void staticTestMethod() {
        System.out.println("private static method.");
    }
}
