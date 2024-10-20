package tictactoe.model;

import java.util.Objects;

public class Grid {
    String[][] grid;
    private static Grid gridObj;

    private Grid(int N){
        this.grid = new String[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                grid[i][j] = "-";
            }
        }
    }

    public boolean validateAndSetPosition(int i, int j, String symbol){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid.length && grid[i][j] == "-") {
            setPosition(i, j, symbol);
            return true;
        }
        return false;
    }

    public void setPosition(int i, int j, String symbol){
        grid[i][j] = symbol;
    }

    public void printGrid(){
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid.length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public boolean checkIfWin(int i, int j){
        boolean horizontal = checkHorizontal(i);
        boolean vertical = checkVertical(j);
        boolean diagonal = checkDiagonal(i, j);
        return horizontal || vertical || diagonal;
    }

    public boolean checkSpace(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] == "-")
                    return true;
            }
        }
        return false;
    }

    private boolean checkHorizontal(int i){
        for(int k = 1; k < grid.length; k++){
            if(grid[i][k] != grid[i][k-1])
                return false;
        }
        return true;
    }

    private boolean checkVertical(int j){
        for(int k = 1; k < grid.length; k++){
            if(grid[k][j] != grid[k-1][j])
                return false;
        }
        return true;
    }

    private boolean checkDiagonal(int i, int j){
        for(int k = 1; k < grid.length; k++){
            for(int l = 1; l < grid.length; l++) {
                if (grid[k][l] != grid[k - 1][l-1])
                    return false;
            }
        }
        return true;
    }

    public static Grid getGridInstance(int N){
        if(Objects.isNull(gridObj))
            gridObj = new Grid(N);
        return gridObj;
    }
}
