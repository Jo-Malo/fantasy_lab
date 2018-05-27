import Enums.RoomType;
import Players.Fighter;
import Players.Spellcaster;
import Tools.MeleeWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    Fighter fighter;
    Spellcaster spellcaster;
    MeleeWeapon meleeWeapon;

    @Before
    public void before(){
        fighter = new Fighter(10, RoomType.SHANGRILA);
        meleeWeapon = new MeleeWeapon(-1);
        spellcaster = new Spellcaster(2, RoomType.ELDORADO);

    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, fighter.getHealthPoints());
    }

    @Test
    public void canGetMeleeWeaponInventoryCount() {
        assertEquals(0, fighter.getMeleeWeaponInventoryCount());
    }

    @Test
    public void canAddMeleeWeaponInventoryCount(){
        fighter.addMeleeWeapontoInventory(meleeWeapon);
        assertEquals(1, fighter.getMeleeWeaponInventoryCount());
    }

    @Test
    public void canManipulateHeathPoints() {
        fighter.addMeleeWeapontoInventory(meleeWeapon);
        fighter.manipulateHeathPoints(spellcaster);
        assertEquals(1, spellcaster.getHealthPoints());
    }

    @Test
    public void canClearMeleeWeaponInventory() {
        fighter.clearMeleeWeaponInventory();
        assertEquals(0, fighter.getMeleeWeaponInventoryCount());
    }

    @Test
    public void canGetRoomInfo() {
        assertEquals(RoomType.ELDORADO, spellcaster.getRoomType());
    }


}
