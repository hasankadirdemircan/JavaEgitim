package singleton_design_pattern;

public class SingletonDesignPatternLazy {

    private static SingletonDesignPatternLazy instance;

    private SingletonDesignPatternLazy() {
    }

    public static SingletonDesignPatternLazy getInstance() {
        if(instance == null) {
            instance = new SingletonDesignPatternLazy();
        }
        return instance;
    }
}
