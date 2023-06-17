package errors;

public class RuntimeErrorExample02 {
    public static void main(String[] args) {
        int [] array = new int[3];
        array[0] = 1;
        boolean is = array[1] < 10;
        if(is) {

        }
        array[2] = 20;

        //System.out.println(a);
       // System.out.println(array[3]);
    }

}
