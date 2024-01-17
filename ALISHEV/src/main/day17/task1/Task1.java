package main.day17.task1;


public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };
        for (ChessPiece x: pieces){
            System.out.print(x + " ");
        }
    }
}
