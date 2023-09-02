package diamon_problem02;

interface BaseInterface{
    public default void message(){
        System.out.println("BaseInterface message..");
    }
}

class BaseClass{
    public void message(){
        System.out.println("BaseClass message..");
    }
}
public class DiamondProblemTest02 extends BaseClass implements BaseInterface{

    public static void main(String[] args) {
       // new DiamondProblemTest02().message();
        DiamondProblemTest02 a = new DiamondProblemTest02();
        a.message();
        // print BaseClass message..
        // cunku class win kurali vardir.
        // Yani ayni isimde 1'den fazla method varsa class'da bulunan method tercih edilir.
    }
}