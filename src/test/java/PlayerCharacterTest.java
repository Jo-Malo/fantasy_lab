import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerCharacterTest {

    PlayerCharacter playerCharacter;

    @Before
    public void before(){
        playerCharacter = new PlayerCharacter(10);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, playerCharacter.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        playerCharacter.setHealthPoints(20);
        assertEquals(20, playerCharacter.getHealthPoints());
    }
}
