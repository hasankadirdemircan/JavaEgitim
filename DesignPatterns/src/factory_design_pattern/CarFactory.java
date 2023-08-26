package factory_design_pattern;

public class CarFactory {
    public static Car createCar(Class aClass) throws InstantiationException, IllegalAccessException {
        return (Car) aClass.newInstance();
    }
}
