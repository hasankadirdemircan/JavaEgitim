package algorithm;

public class Algorithm01 {
    public static void main(String[] args) {
        int [] grades = {73, 67, 38, 33, 79, 87, 88};
        gradingStudents(grades);

        for (int grade : grades) {
            System.out.println(grade);
        }
    }
    private static int [] gradingStudents(int [] grades) {
        for(int i=0; i<grades.length; i++) {
            if(grades [i] < 38){
                System.out.println("do nothing");
            }else {
                int nextValue = getRound(grades[i], 5);
                if(nextValue - grades[i] < 3) {
                    grades[i] = nextValue;
                }
            }

        }
        return grades;
    }

    public static int getRound(double grade, int nextMultiple) {
        return (int) (Math.ceil(grade / nextMultiple) * nextMultiple);
    }
}
