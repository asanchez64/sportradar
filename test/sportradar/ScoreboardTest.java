package sportradar;

import org.junit.Test;

/**
 * Scoreboard Test
 * 
 * @author sportradar (AMSR)
 */
public class ScoreboardTest {
    
    public ScoreboardTest() {        
    }
        
    /**
     * First test
     */
    @Test
    public void a_test() {
        
        System.out.println("--------------");
        System.out.println("Firts test");
        System.out.println("--------------");
        
        Scoreboard scoreboard = new Scoreboard();
        Game game1 = new Game("Mexico", "Canada");
        Game game2 = new Game("Spain", "Brazil");
        Game game3 = new Game("Germany", "France");
        Game game4 = new Game("Uruguay", "Italy");
        Game game5 = new Game("Argentina", "Australia");
        Game game6 = new Game("England", "Portugal");
        
        System.out.println("--------------");
        System.out.println("Start games");
        System.out.println("--------------");
        scoreboard.startGame(game1);
        scoreboard.startGame(game2);
        scoreboard.startGame(game3);
        scoreboard.startGame(game4);
        scoreboard.startGame(game5);
        scoreboard.getSummary();            
        
        System.out.println("--------------");
        System.out.println("Update games");
        System.out.println("--------------");
        scoreboard.updateGame(game1, 0, 5);        
        scoreboard.updateGame(game2, 10, 2); 
        scoreboard.updateGame(game3, 2, 2); 
        scoreboard.updateGame(game4, 6, 6); 
        scoreboard.updateGame(game5, 2, 2); 
        scoreboard.getSummary();      
        
        System.out.println("------------------------------------");
        System.out.println("Start game " + game6.toString());
        System.out.println("------------------------------------");
        scoreboard.startGame(game6); 
        scoreboard.getSummary();
        
        scoreboard.updateGame(game6, 0, 5); 
        System.out.println("------------------------------------");
        System.out.println("Update game " + game6.toString());
        System.out.println("------------------------------------");
        scoreboard.getSummary();      
        
        System.out.println("------------------------------------");
        System.out.println("Finish game " + game1.toString());
        System.out.println("------------------------------------");
        scoreboard.finishGame(game1);
        scoreboard.getSummary();
        
        System.out.println("------------------------------------");
        System.out.println("Finish game " + game2.toString());
        System.out.println("------------------------------------");
        scoreboard.finishGame(game2);
        scoreboard.getSummary();
    }
}