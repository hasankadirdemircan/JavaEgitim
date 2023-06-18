package while_loop;

public class WhileLoopExample01 {
    public static void main(String[] args) {
        int startNumber = 0, finishNumber = 5;

        while(startNumber <= finishNumber){

            System.out.println(startNumber++);

            if(startNumber == 3) {
                break;
            }
        }
    }
}
