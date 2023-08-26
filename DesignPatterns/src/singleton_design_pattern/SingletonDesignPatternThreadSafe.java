package singleton_design_pattern;

public class SingletonDesignPatternThreadSafe {
    private static SingletonDesignPatternThreadSafe instance;

    private SingletonDesignPatternThreadSafe() {

    }

    public static synchronized SingletonDesignPatternThreadSafe getInstance() {
        if(instance == null) {
            instance = new SingletonDesignPatternThreadSafe();
        }
        return instance;
    }
}
