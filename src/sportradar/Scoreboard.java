package sportradar;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to emule Scoreboards
 * 
 * @author sportradar (AMSR)
 */
public class Scoreboard {
    
    List<Game> gameList;
    
    /**
     * Default Constructor
     * 
     */
    public Scoreboard(){
        this.gameList = new ArrayList();
    }
    
    /**
     * Method to start a Game
     * 
     * @param pGame to start
     */
    public void startGame(Game pGame){
                
        this.gameList.add(pGame);
    }
    
    /**
     * Method to finish a Game
     * 
     * @param pGame Game to finish
     */
    public void finishGame(Game pGame){
        
        this.gameList.remove(pGame);
    }
    
    /**
     * Method to update a Game
     * 
     * Remove and Add to implements:
     * Those games with the same total score will be returned ordered by 
     * the most recently added to our system
     * 
     * @param pGame to update
     * @param homeScore Home team score
     * @param awayScore Away team score
     */
    public void updateGame(Game pGame, int homeScore, int awayScore){
        
        this.gameList.remove(pGame);
        
        pGame.setHomeScore(homeScore);
        pGame.setAwayScore(awayScore);
        
        this.gameList.add(pGame);
    }
    
    /**
     * Method to print a summary scoreboard
     * 
     * Those games with the same total score will be returned ordered by 
     * the most recently added to our system
     * 
     */
    public void getSummary(){
        
        StringBuilder sb = new StringBuilder();
        
        if (this.gameList.isEmpty()){
            sb.append("No results");
        } else {
            Game game;
            int cont = 1;
            
            for (int i = (this.gameList.size() - 1); i >=0; i--){
                game = (Game) this.gameList.get(i);
                sb.append(cont++);
                sb.append(" : ");
                sb.append(game.toString());
                sb.append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}