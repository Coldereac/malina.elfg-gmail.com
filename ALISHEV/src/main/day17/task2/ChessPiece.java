package main.day17.task2;

public enum ChessPiece {
    KING_WHITE(100, '♔'),
    QUEEN_WHITE(9, '♕'),
    ROOK_WHITE(5, '♖'),
    BISHOP_WHITE(3.5f, '♗'),
    KNIGHT_WHITE(3, '♘'),
    PAWN_WHITE(1, '♙'),
    KING_BLACK(100, '♚'),
    QUEEN_BLACK(9, '♛'),
    ROOK_BLACK(5, '♜'),
    BISHOP_BLACK(5, '♝'),
    KNIGHT_BLACK(3.5f, '♞'),
    PAWN_BLACK(1, '♟'),
    EMPTY(-1, '_');

    private final float cost;

    private final char icon;

    ChessPiece(float cost, char icon) {
        this.cost = cost;
        this.icon = icon;
    }

    public float getCost() {
        return cost;
    }

    public char getIcon() {
        return icon;
    }

    @Override
    public String  toString() {
        return String.valueOf(icon);
    }
}
