import Enums.RoomType;
import Players.Fighter;
import Players.Healer;
import Tools.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {
    Healer healer;
    HealingTool healingTool;
    Fighter fighter;

    @Before
    public void before(){
        healer = new Healer(10, RoomType.HOBBITON);
        healingTool = new HealingTool(1);
        fighter = new Fighter(10, RoomType.SHANGRILA);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, healer.getHealthPoints());
    }

    @Test
    public void canGetHealingToolInventoryCount() {
        assertEquals(0, healer.getHealingToolInventoryCount());
    }

    @Test
    public void canAddHealingToolInventoryCount(){
        healer.addHealingToolInventory(healingTool);
        assertEquals(1, healer.getHealingToolInventoryCount());
    }

    @Test
    public void canManipulateHeathPoints() {
        healer.addHealingToolInventory(healingTool);
        healer.manipulateHeathPoints(fighter);
        assertEquals(11, fighter.getHealthPoints());
    }

    @Test
    public void canClearHealingToolInventory() {
        healer.clearHealingToolInventory();
        assertEquals(0, healer.getHealingToolInventoryCount());
    }
}
