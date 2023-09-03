package stream_api.terminal_operation;

import java.util.Arrays;
import java.util.Comparator;

public class StreamExample24 {
    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        String[] string2 = "you never know what you have until you clean your room".split(" ");
        String[] string3 = "you never know what you have until you clean your room".split(" ");

        System.out.println(Arrays.stream(string).min(String::compareTo).get());
        System.out.println(Arrays.stream(string2).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(string3).min(lengthCompare).get());
    }
}
