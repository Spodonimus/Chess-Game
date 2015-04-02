/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

/**
 *
 * @author Andrew
 */
public class ChessGame {
    
    public void ChessGame(){
    
        //Create chess pieces
        
        //team 1 chess pieces (team 1 = bottom)
        
        //Pawns for team 1
        ChessPiece pawn1T1 = new ChessPiece("pawn1T1", PieceType.PAWN, 2, 1, TeamSide.BOTTOM);
        ChessPiece pawn2T1 = new ChessPiece("pawn2T1", PieceType.PAWN, 2, 2, TeamSide.BOTTOM);
        ChessPiece pawn3T1 = new ChessPiece("pawn3T1", PieceType.PAWN, 2, 3, TeamSide.BOTTOM);
        ChessPiece pawn4T1 = new ChessPiece("pawn4T1", PieceType.PAWN, 2, 4, TeamSide.BOTTOM);
        ChessPiece pawn5T1 = new ChessPiece("pawn5T1", PieceType.PAWN, 2, 5, TeamSide.BOTTOM);
        ChessPiece pawn6T1 = new ChessPiece("pawn6T1", PieceType.PAWN, 2, 6, TeamSide.BOTTOM);
        ChessPiece pawn7T1 = new ChessPiece("pawn7T1", PieceType.PAWN, 2, 7, TeamSide.BOTTOM);
        ChessPiece pawn8T1 = new ChessPiece("pawn8T1", PieceType.PAWN, 2, 8, TeamSide.BOTTOM);
        
        //rooks for team 1
        ChessPiece rook1T1 = new ChessPiece("rook1T1", PieceType.ROOK, 1, 1, TeamSide.BOTTOM);
        ChessPiece rook2T1 = new ChessPiece("rook2T1", PieceType.ROOK, 1, 8, TeamSide.BOTTOM);
        
        //knights for team 1
        ChessPiece knight1T1 = new ChessPiece("knight1T1", PieceType.KNIGHT, 1, 2, TeamSide.BOTTOM);
        ChessPiece knight2T1 = new ChessPiece("knight2T1", PieceType.KNIGHT, 1, 7, TeamSide.BOTTOM);
        
        //bishops for team 1
        ChessPiece bishop1T1 = new ChessPiece("bishop1T1", PieceType.BISHOP, 1, 3, TeamSide.BOTTOM);
        ChessPiece bishop2T1 = new ChessPiece("bishop2T1", PieceType.BISHOP, 1, 6, TeamSide.BOTTOM);
        
        //queen for team 1
        ChessPiece queenT1 = new ChessPiece("queenT1", PieceType.QUEEN, 1, 4, TeamSide.BOTTOM);
        
        //king for team 1
        ChessPiece kingT1 = new ChessPiece("kingT1", PieceType.QUEEN, 1, 5, TeamSide.BOTTOM);
    
        
        //team 2 chess pieces (team 2 = top)
        
        //Pawns for team 2
        ChessPiece pawn1T2 = new ChessPiece("pawn1T2", PieceType.PAWN, 7, 1, TeamSide.TOP);
        ChessPiece pawn2T2 = new ChessPiece("pawn2T2", PieceType.PAWN, 7, 2, TeamSide.TOP);
        ChessPiece pawn3T2 = new ChessPiece("pawn3T2", PieceType.PAWN, 7, 3, TeamSide.TOP);
        ChessPiece pawn4T2 = new ChessPiece("pawn4T2", PieceType.PAWN, 7, 4, TeamSide.TOP);
        ChessPiece pawn5T2 = new ChessPiece("pawn5T2", PieceType.PAWN, 7, 5, TeamSide.TOP);
        ChessPiece pawn6T2 = new ChessPiece("pawn6T2", PieceType.PAWN, 7, 6, TeamSide.TOP);
        ChessPiece pawn7T2 = new ChessPiece("pawn7T2", PieceType.PAWN, 7, 7, TeamSide.TOP);
        ChessPiece pawn8T2 = new ChessPiece("pawn8T2", PieceType.PAWN, 7, 8, TeamSide.TOP);
        
        //rooks for team 2
        ChessPiece rook1T2 = new ChessPiece("rook1T2", PieceType.ROOK, 7, 1, TeamSide.TOP);
        ChessPiece rook2T2 = new ChessPiece("rook2T2", PieceType.ROOK, 7, 8, TeamSide.TOP);
        
        //knights for team 2
        ChessPiece knight1T2 = new ChessPiece("knight1T2", PieceType.KNIGHT, 7, 2, TeamSide.TOP);
        ChessPiece knight2T2 = new ChessPiece("knight2T2", PieceType.KNIGHT, 7, 7, TeamSide.TOP);
        
        //bishops for team 2
        ChessPiece bishop1T2 = new ChessPiece("bishop1T2", PieceType.BISHOP, 7, 3, TeamSide.TOP);
        ChessPiece bishop2T2 = new ChessPiece("bishop2T2", PieceType.BISHOP, 7, 6, TeamSide.TOP);
        
        //queen for team 1
        ChessPiece queenT2 = new ChessPiece("queenT2", PieceType.QUEEN, 7, 4, TeamSide.TOP);
        
        //king for team 1
        ChessPiece kingT2 = new ChessPiece("kingT2", PieceType.QUEEN, 7, 5, TeamSide.TOP);
    }
    
    public void start(){
        
    }
    
    
}
