package final_examples04;

public class FinalStaticExample01 {
    private static final String COLON = ":";
    private static final String ELDERY_PEOPLE = "ELDERLY";
    private static final String COMMA = ",";
    private static final String DOT = ".";

    public static void main(String[] args) {

        String uid ="22321323";
        String request = "21321323";

        //id
        //uid:request

        System.out.println("String concat");
        System.out.println(uid.concat(COLON).concat(request));

        System.out.println("String Builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(uid).append(COLON).append(request));



        //başka bir örnek
        String programLang = "Java,NET,Python";
        String[] programLangArray = programLang.split(COMMA);
        for (String lang : programLangArray) {
            System.out.println(lang);
        }
    }
}
