package tictactoe.service;

import tictactoe.model.Grid;
import tictactoe.model.Player;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

public class TicTacToeService {
    List<Player> playerList;

    public TicTacToeService(List<Player> playerList){
        this.playerList = playerList;
    }

    public void playGame() throws IOException {
        DataInputStream reader = new DataInputStream(System.in);
        String position;
        int n = 0;
        Grid grid = Grid.getGridInstance(3);
        int noPlayers = playerList.size();
        Player player = null;
        boolean hasWon = false;
        grid.printGrid();

        while(!hasWon && !(position = reader.readLine()).equals("exit")){
            System.out.println(position);
            if(n == noPlayers)
                n = 0;
            String[] parts = position.split(" ");
            int i = Integer.parseInt(parts[0]);
            int j = Integer.parseInt(parts[1]);
            player = playerList.get(n);

            if(!grid.validateAndSetPosition(i-1, j-1, player.getPiece())) {
                System.out.println("Invalid move");
                continue;
            }
            grid.printGrid();
            hasWon = grid.checkIfWin(i-1, j-1);
            n++;
            if(!grid.checkSpace())
                return;
        }
        if(hasWon)
            printWinner(player);

        return;
    }

    private void printWinner(Player player){
        System.out.println(player.getPlayerName() + " has won the game");
    }
}
