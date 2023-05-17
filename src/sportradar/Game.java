package sportradar;


/**
 * Class to emule Games
 * 
 * @author sportradar (AMSR)
 */
public class Game{
    
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    /**
     * Default Constructor
     * 
     * @param pHomeT Home team
     * @param pAwayT Away team
     */
    public Game(String pHomeT, String pAwayT){
        
        this.homeTeam = pHomeT;
        this.awayTeam = pAwayT;
        this.homeScore = 0;
        this.awayScore = 0;        
    }
    
    /**
     * Method to return data Game
     * 
     * @return 
     */
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.homeTeam);
        sb.append(" ").append(this.getHomeScore()).append(" ");
        sb.append(" - ");
        sb.append(this.awayTeam);
        sb.append(" ").append(this.getAwayScore()).append(" ");
        
        return sb.toString();
    }
    
    // getters and setters methods

    /**
     * @return the homeScore
     */
    public int getHomeScore() {
        return homeScore;
    }

    /**
     * @param homeScore the homeScore to set
     */
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    /**
     * @return the awayScore
     */
    public int getAwayScore() {
        return awayScore;
    }

    /**
     * @param awayScore the awayScore to set
     */
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
}