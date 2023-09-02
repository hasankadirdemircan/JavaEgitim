package function;

import java.util.function.Function;

public class FunctionExample06 {
    public static void main(String[] args) {
        Function<String, StringBuilder> extractNumbers = text -> {
            StringBuilder numbers = new StringBuilder();
            for(char c : text.toCharArray()) {
                if(Character.isDigit(c)){
                    numbers.append(c);
                    numbers.append(",");
                }
            }
            return numbers;
        };

        String sentence = "I have 3 apples and 5 oranges.";
        StringBuilder extractedNumbers = extractNumbers.apply(sentence);
        System.out.println("Extracted numbers: " + extractedNumbers);

    }
}
