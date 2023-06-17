package if_statements;

public class NestedIfStatementExample01 {
    public static void main(String[] args) {
        String subjectName = "java";
        String courseName = "java";
        String welcome = "hoşgeldiniz ";
        int studentAge = 8;
        int age = 18;

        if(subjectName.equals(courseName)) {
            System.out.println(welcome + courseName + " kursuna");
            if(studentAge >= age) {
                System.out.println("dersler görüntüleniyor.");
            }else {
                System.out.println("yaş kriteri sağlanmamaktadır.");
            }
        }
    }
}
