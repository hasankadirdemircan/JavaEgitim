package constructor;

public class ConstructorExample01Main {
    String name;
    ConstructorExample01Main() {
        System.out.println("Constructor ConstructorExample01Main");
    }
    public static void main(String[] args) {
        ConstructorExample01 constructorExample01Object = new ConstructorExample01("TR");
        System.out.println(constructorExample01Object.language);
        constructorExample01Object.language = "ESP";
        System.out.println(constructorExample01Object.language);

        ConstructorExample01 constructorExample01Object2 = new ConstructorExample01("ENG");
        System.out.println(constructorExample01Object2.language);

        System.out.println(constructorExample01Object.language);
        ConstructorExample01Main constructorExample01MainObject = new ConstructorExample01Main();

    }

    public void test() {
       // constructorExample01Object.
    }
}
