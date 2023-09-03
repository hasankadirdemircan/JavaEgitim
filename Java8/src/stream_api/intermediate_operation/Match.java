package stream_api.intermediate_operation;

public class Match {
    private String matchName;
    private int playerCount;

    public Match(String matchName, int playerCount) {
        this.matchName = matchName;
        this.playerCount = playerCount;
    }

    public String getMatchName() {
        return matchName;
    }

    public int getPlayerCount() {
        return playerCount;
    }
}
