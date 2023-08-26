package singleton_design_pattern;

public class MainLazy {
    public static void main(String[] args) {


        SingletonDesignPattern01 a = new SingletonDesignPattern01();
        SingletonDesignPattern01 b = new SingletonDesignPattern01();
        SingletonDesignPattern01 c = new SingletonDesignPattern01();

        SingletonDesignPatternLazy instance1 = SingletonDesignPatternLazy.getInstance();
        SingletonDesignPatternLazy instance2 = SingletonDesignPatternLazy.getInstance();
        SingletonDesignPatternLazy instance3 = SingletonDesignPatternLazy.getInstance();

        System.out.println(a==b);
        System.out.println(instance1==instance2); //aynı instance
    }
}
