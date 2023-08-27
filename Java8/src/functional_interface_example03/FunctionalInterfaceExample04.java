package functional_interface_example03;

public class FunctionalInterfaceExample04 {
    public static void main(String[] args) {
        String inputText = "Merhaba Dünya 2024";


        //uzun hali
       /* StringTransformer toUpperCaseTransformer = input -> {
            return input.toUpperCase();
        };*/

        //kısa hali
        StringTransformer toUpperCaseTransformer = String::toUpperCase;
        StringTransformer toLowerCaseTransformer = String::toLowerCase;
        String transformedText = toUpperCaseTransformer.transform(inputText);
        System.out.println(transformedText);

        transformedText = toLowerCaseTransformer.transform(inputText);
        System.out.println(transformedText);
        transformedText = toLowerCaseTransformer.transform(inputText);
        System.out.println(transformedText);

    }
}
