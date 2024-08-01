package snakeandladder;

import snakeandladder.model.Board;
import snakeandladder.model.Player;
import snakeandladder.service.PlayService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noSnakes, noLadders, noPlayers;
        Board board = Board.getInstance();

        noSnakes = sc.nextInt();
        while(noSnakes-->0){
            int startPos = sc.nextInt();
            int endPos = sc.nextInt();
            board.setSnake(startPos, endPos);
        }

        noLadders = sc.nextInt();
        while(noLadders-->0){
            int startPos = sc.nextInt();
            int endPos = sc.nextInt();
            board.setLadder(startPos, endPos);
        }

        noPlayers = sc.nextInt();
        while(noPlayers-->0){
            String playerName = sc.next();
            board.setPlayer(new Player(playerName));
        }

        PlayService playService = new PlayService();
        Player winner = playService.playGame();
        System.out.println(winner.getName() + " wins the game!");
    }
}
