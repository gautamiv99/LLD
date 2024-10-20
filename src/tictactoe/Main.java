package tictactoe;

/*
Ask the user for the names of the two players
Print the grid after initializing
Allow the user to make moves on behalf of both the players.
The user will make a move by entering the cell position.
You need to determine the piece (X/O) and make the move if it is valid.
Valid move:
The piece is controlled by the player having the current turn
The cell is empty
If the move is invalid
print 'Invalid Move'
the same player plays again
If the move is valid:
put the piece on the cell
print the board after the move
Determine if a player has won or if there are no valid moves left. Ignore all moves mentioned after that.
*/

import tictactoe.model.Player;
import tictactoe.service.TicTacToeService;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream reader = new DataInputStream(System.in);
        int noOfPlayers = Integer.parseInt(reader.readLine());
        List<Player> playerList = new LinkedList<>();

        for(int i = 0; i < noOfPlayers; i++){
            String s = reader.readLine();
            String[] parts = s.split(" ");
            String name = parts[0];
            String symbol = parts[1];
            Player player = new Player(name, symbol);
            playerList.add(player);
        }

        TicTacToeService ticTacToeService = new TicTacToeService(playerList);

        ticTacToeService.playGame();
    }
}
