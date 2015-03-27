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
     * @param pieceName The name of the piece. pawn1
     * @param pieceType The type of the piece. ex: PAWN
     * @param pieceXCoord The x coordinate of the piece
     * @param pieceYCoord The y coordinate of the piece
     * @param pieceTeamSide The team that the piece is on. Should be 1 or 2.
     */
        
    
    public ChessPiece (String pieceName, String pieceType, Integer pieceXCoord, 
                       Integer pieceYCoord, Integer pieceTeamSide)
    {
        name = pieceName;
        
        type = pieceType;
        
        xCoord = pieceXCoord;
        
        yCoord = pieceYCoord;
        
        teamSide = pieceTeamSide;
    }

    /**
     * States the position of the piece. Mainly for testing purposes.
     * @return String representation of the position of the piece.
     */
    public String getPosition(){

        String pos = "X coordinate for " + name + ": " + xCoord + "/n" +
                     "Y coordiante for " + name + ": " + yCoord + "/n";
        return pos;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
    
        return name;
    }
    
    /**
     *
     * @param pieceName
     */
    public void setName(String pieceName){
        
        name = pieceName;
    }
    
    /**
     *
     * @return
     */
    public String getType(){
        
        return type;
    }
    
    /**
     *
     * @param pieceType
     */
    public void setType(String pieceType){
        
        type = pieceType;
    }
    
    /**
     *
     * @return
     */
    public Integer getXCoord(){
        
        return xCoord;
    }
    
    /**
     *
     * @param pieceXCoord
     */
    public void setXCoord(Integer pieceXCoord){
        
        xCoord = pieceXCoord;
    }
    
    /**
     *
     * @return
     */
    public Integer getYCoord(){
        
        return yCoord;
    }
    
    /**
     *
     * @param pieceYCoord
     */
    public void setYCoord(Integer pieceYCoord){
        
        yCoord = pieceYCoord;
    }
    
    //Variables Section
    
    //The name of the piece
    String name;
    
    //The type of the piece
    String type;
    
    //The x coordinate of the piece on the board
    Integer xCoord;
    
    //The y coordinate of the piece on the board
    Integer yCoord;
    
    //The team that the piece is on. Should be 1 or 2.
    Integer teamSide;
}
