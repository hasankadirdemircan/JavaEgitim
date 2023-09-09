package stream_api.terminal_operation;

import com.sun.source.tree.Tree;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample37 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> treeSet = stream.collect(Collectors.toCollection(TreeSet::new));
    }
}
