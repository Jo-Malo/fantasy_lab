import Enums.RoomType;
import Players.PlayerCharacter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LevelTest {
    private Level level;
    private PlayerCharacter players;

    @Before
    public void setUp(){
        level = new Level(RoomType.HOBBITON);

    }

    @Test
    public void levelHasRoom(){
        assertEquals(RoomType.HOBBITON, level.getRoomType());
    }

    @Test
    public void levelHasReward(){
      assertEquals(2, level.getLevelReward());
    }

    @Test
    public void levelHasBeast(){
        assertEquals("Hobbit", level.getRoomBeast());
    }

    @Test
    public void getPlayerCharacterCountInRoom() {
        assertEquals(0, level.playerCharacterInRoomCount());
    }

    @Test
    public void addRoom(){
        level.addPlayerCharacterToRoom(players);
        assertEquals(1, level.playerCharacterInRoomCount());
    }
}
