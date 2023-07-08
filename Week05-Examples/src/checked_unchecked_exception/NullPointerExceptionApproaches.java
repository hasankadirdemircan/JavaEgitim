package checked_unchecked_exception;

public class NullPointerExceptionApproaches {
    public static void main(String[] args) {
        String name = null;
        //String name = "null"; bu obje NULL DEGİLDİR.!!

        //bad approach
      /*  try {
            name.concat(" welcome");
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException");
        }
        */

        //good approach
        if(name != null) {
            name = name.concat(" welcome");
            System.out.println(name);
        }

        System.out.println("finish line");
    }
}
