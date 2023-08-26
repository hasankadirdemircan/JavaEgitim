package singleton_design_pattern;

public class MainEager {
    public static void main(String[] args) {
        SingletonDesignPatternEager instance1 = SingletonDesignPatternEager.getInstance();
        SingletonDesignPatternEager instance2 = SingletonDesignPatternEager.getInstance();
        SingletonDesignPatternEager instance3 = SingletonDesignPatternEager.getInstance();
        System.out.println("Instance created");
        System.out.println(instance1 == instance2);
    }
}
