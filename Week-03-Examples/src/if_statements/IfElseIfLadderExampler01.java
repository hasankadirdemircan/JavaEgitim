package if_statements;

public class IfElseIfLadderExampler01 {
    public static void main(String[] args) {
        int examResult1 = 5;
        int examResult2 = 10;
        int examResult3 = 15;
        int examResult4 = 20;

        int studentExamResult = 4;

        if(studentExamResult < examResult1){
            System.out.println("FF");
        } else if(studentExamResult >= examResult1 && studentExamResult < examResult2) {
            if(studentExamResult == 6) {

            }
            System.out.println("CC");
        } else if(studentExamResult >= examResult2 && studentExamResult < examResult3) {
            System.out.println("BB");
        } else {
            System.out.println("AA");
        }
    }
}
