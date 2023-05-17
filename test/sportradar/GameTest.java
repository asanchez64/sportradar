package sportradar;

import org.junit.Test;


/**
 * Game tests
 * 
 * @author sportradar (AMSR)
 */
public class GameTest {
    
    
    public GameTest() {
    }
    
    /**
     * First test
     */
    @Test
    public void test1(){
        
        Game game1 = new Game("Sevilla", "Betis");
        
        System.out.println(game1.toString());
    }  
}