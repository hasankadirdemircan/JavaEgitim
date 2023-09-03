package stream_api.intermediate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample15 {
    public static void main(String[] args) {
        List<Match> matchList = Arrays.asList(
                new Match("FootballMatch", 11),
                new Match("BasketballMatch", 7),
                new Match("Soccer", 7),
                new Match("Tennis", 2)
        );

        Optional<String> matchName = matchList.stream()
                .map(Match::getMatchName)
                .filter(e -> e.endsWith("Match"))
                .sorted()
                .findFirst();
        System.out.println("Result: " + matchName.orElse("match not found"));
    }
}
