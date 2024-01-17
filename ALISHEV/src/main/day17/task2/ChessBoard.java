package main.day17.task2;

public class ChessBoard {
    private ChessPiece[][] pieces;

    public ChessBoard(ChessPiece[][] pieces) {
        if (pieces.length == 8 && pieces[0].length == 8)
            this.pieces = pieces;
    }

    public void print(){

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(pieces[i][j]);
            System.out.println();
        }

    }
}
