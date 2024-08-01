package snakeandladder.service;

import snakeandladder.model.Board;
import snakeandladder.model.Dice;
import snakeandladder.model.Player;

public class PlayService {
    Board board;
    Dice dice;

    public PlayService(){
        board = Board.getInstance();
        dice = new Dice();
    }

    public Player playGame(){
        int i = 0;
        Player player;
        do {
            player = board.getPlayers().get(i);
            int number = dice.rollDice();
            int initialPosition = player.getPosition();
            int position = (player.getPosition() + number)<=100?(player.getPosition() + number): player.getPosition();

            if(board.getSnakes().containsKey(position))
                player.setPosition(board.getSnakes().get(position));
            else if(board.getLadders().containsKey(position))
                player.setPosition(board.getLadders().get(position));
            else
                player.setPosition(position);

            System.out.println(player.getName() + " rolled a " + number + " and moved from " + initialPosition +
                    " to " + player.getPosition());

            i = (i+1)%board.getPlayers().size();
        } while(!hasWon(player));

        return player;
    }

    public boolean hasWon(Player player){
        if(player.getPosition() == board.getEnd())
            return true;
        return false;
    }
}
