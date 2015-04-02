/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

/**
 * The class for the chess pieces of the game
 * @author Andrew
 */
public class ChessPiece {
    
    
    //Methods Section
    
    /**
     *
     * @param pieceName The name of the piece. ex:pawn1
     * @param pieceType The type of the piece. ex: PAWN
     * @param pieceXCoord The x coordinate of the piece
     * @param pieceYCoord The y coordinate of the piece
     * @param pieceTeamSide The team that the piece is on. Should be 1 or 2.
     */
        
    
    public ChessPiece (String pieceName, PieceType pieceType, Integer pieceXCoord, 
                       Integer pieceYCoord, TeamSide pieceTeamSide)
    {
        name = pieceName;
        
        type = pieceType;
        
        xCoord = pieceXCoord;
        
        yCoord = pieceYCoord;
        
        teamSide = pieceTeamSide;
    }

    /**
     * Gets the position of the piece in string form. Mainly for testing purposes.
     * @return pos
     */
    public String getPosition(){

        String pos = "X coordinate for " + name + ": " + xCoord + "/n" +
                     "Y coordiante for " + name + ": " + yCoord + "/n";
        return pos;
    }
    
    /**
     * Gets the name of the piece
     * @return name
     */
    public String getName(){
    
        return name;
    }
    
    /**
     * Sets the name of the chess piece
     * @param pieceName
     */
    public void setName(String pieceName){
        
        name = pieceName;
    }
    
    /**
     * Gets the type of the chess piece
     * @return
     */
    public PieceType getType(){
        
        return type;
    }
    
    /**
     * Sets the type of the chess piece
     * @param pieceType
     */
    public void setType(PieceType pieceType){
        
        type = pieceType;
    }
    
    /**
     * Gets the x coordinate of the chess piece
     * @return xCoord
     */
    public Integer getXCoord(){
        
        return xCoord;
    }
    
    /**
     * Sets the x coordinate of the chess piece
     * @param pieceXCoord
     */
    public void setXCoord(Integer pieceXCoord){
        
        xCoord = pieceXCoord;
    }
    
    /**
     * Gets the y coordinate of the chess piece
     * @return yCoord
     */
    public Integer getYCoord(){
        
        return yCoord;
    }
    
    /**
     * Sets the y  coordinate of the chess piece
     * @param pieceYCoord
     */
    public void setYCoord(Integer pieceYCoord){
        
        yCoord = pieceYCoord;
    }
    
    //Variables Section
    
    //The name of the piece
    String name;
    
    //The type of the piece
    PieceType type;
    
    //The x coordinate of the piece on the board
    Integer xCoord;
    
    //The y coordinate of the piece on the board
    Integer yCoord;
    
    //The team that the piece is on. Should be 1 or 2.
    TeamSide teamSide;
}
