package class_examples.objects;

public class Main {
    static void myStaticMethod() {
        System.out.println("static method, object üretilmeden çağrılabilir");
    }

    public void myPublicMethod() {
        System.out.println("public method, yalnız object üretilip, çağrılarak ulaşılabilir.");
    }
    public static void main(String[] args) {
        myStaticMethod();
       // myPublicMethod(); object üretmediğimden ve myPublicMethod static olmadığından böyle ulaşamıyorum.
        Main main = new Main();
        main.myPublicMethod();

    }
}
