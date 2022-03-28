package chess;

import boardgame.Piece;
import boardgame.Position;

public class ChessException extends RuntimeException{
    private static final long  serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
    //private Piece makeMove(Position source, Position target) {
        //Piece p = board.removePiece(source);
    //}
}
