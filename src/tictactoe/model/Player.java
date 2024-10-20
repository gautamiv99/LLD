package tictactoe.model;

public class Player {
    private String playerName;
    private String piece;
    private boolean hasWon;

    public Player(String playerName, String piece) {
        this.playerName = playerName;
        this.piece = piece;
        this.hasWon = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}
