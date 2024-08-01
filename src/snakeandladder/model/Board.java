package snakeandladder.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    private static Board board;
    private int start;
    private int end;
    private static HashMap<Integer, Integer> snakes;
    private static HashMap<Integer, Integer> ladders;
    private static List<Player> players;

    private Board(int start, int end){
        this.start = start;
        this.end = end;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        this.players = new ArrayList<>();
    }

    public void setSnake(int startPos, int endPos){
        snakes.put(startPos, endPos);
    }

    public HashMap<Integer, Integer> getSnakes(){
        return snakes;
    }

    public void setLadder(int startPos, int endPos){
        ladders.put(startPos, endPos);
    }

    public HashMap<Integer, Integer> getLadders(){
        return ladders;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public List<Player> getPlayers(){
        return players;
    }

    public void setPlayer(Player player){
        players.add(player);
    }

    public static Board getInstance(){
        if(board == null)
                board = new Board(1, 100);
        return board;
    }
}
