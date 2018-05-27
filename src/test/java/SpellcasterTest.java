import Enums.RoomType;
import Players.Fighter;
import Players.Spellcaster;
import Tools.Familiar;
import Tools.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellcasterTest {
    Spellcaster spellcaster;
    Spell spell;
    Familiar familiar;
    Fighter fighter;

    @Before
    public void before(){
        spellcaster = new Spellcaster(10, RoomType.ELDORADO);
        spell = new Spell(-1);
        familiar = new Familiar(-1);
        fighter = new Fighter(10, RoomType.SHANGRILA);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, spellcaster.getHealthPoints());
    }

    @Test
    public void canGetFamiliarInventoryCount() {
        assertEquals(0, spellcaster.getFamiliarInventoryCount());
    }


    @Test
    public void canGetSpellInventoryCount() {
        assertEquals(0, spellcaster.getSpellInventoryCount());
    }

    @Test
    public void canAddSpellToSpellInventory(){
        spellcaster.addSpellToSpellInventory(spell);
        assertEquals(1, spellcaster.getSpellInventoryCount());
    }

    @Test
    public void canAddFamiliarToSpellInventory(){
        spellcaster.addFamiliarToFamiliarInventory(familiar);
        assertEquals(1, spellcaster.getFamiliarInventoryCount());
    }

    @Test
    public void canManipulateHeathPoints() {
        spellcaster.addFamiliarToFamiliarInventory(familiar);
        spellcaster.manipulateHeathPoints(fighter);
        assertEquals(9, fighter.getHealthPoints());
    }

    @Test
    public void canClearFamiliarInventory() {
        spellcaster.clearfamiliarInventory();
        assertEquals(0, spellcaster.getFamiliarInventoryCount());
    }

    @Test
    public void canClearSpellInventory() {
        spellcaster.clearSpellInventory();
        assertEquals(0, spellcaster.getSpellInventoryCount());
    }
}
