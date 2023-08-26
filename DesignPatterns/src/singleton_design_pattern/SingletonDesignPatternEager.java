package singleton_design_pattern;

public class SingletonDesignPatternEager {
    private static SingletonDesignPatternEager instance = new SingletonDesignPatternEager();
    private SingletonDesignPatternEager() {
    }

    public static SingletonDesignPatternEager getInstance() {
        return instance;
    }
}
