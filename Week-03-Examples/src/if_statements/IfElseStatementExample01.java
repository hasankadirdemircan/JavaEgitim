package if_statements;

public class IfElseStatementExample01 {
    public static void main(String[] args) {
      String subjectName = "CSharp";
      String courseName = "java";

      if(subjectName.equals(courseName)) {
          System.out.println("dogru derstesiniz");
      }else {
          System.out.println("yanlış ders seçimi. Bizim dersimiz : " + courseName);
      }
    }
}
