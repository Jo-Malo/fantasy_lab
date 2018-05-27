package Players;

import Enums.RoomType;
import Tools.Familiar;
import Tools.Item;
import Tools.Spell;

import java.util.ArrayList;

public class Spellcaster extends PlayerCharacter {
    private ArrayList<Familiar> familiarInventory;
    private ArrayList<Spell> spellInventory;

    public Spellcaster(int healthPoints, RoomType roomType){
        super(healthPoints, roomType);
        familiarInventory = new ArrayList<>();
        spellInventory = new ArrayList<>();
    }

    public int getFamiliarInventoryCount() {
        return this.familiarInventory.size();
    }

    public int getSpellInventoryCount() {
        return this.spellInventory.size();
    }

    public void addSpellToSpellInventory(Spell spell) {
        this.spellInventory.add(spell);
    }

    public void addFamiliarToFamiliarInventory(Familiar familiar) {
        this.familiarInventory.add(familiar);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {
        Item equippedItem = this.familiarInventory.get(0);
        int healthPointManipulationInt = equippedItem.getHealthPointManipulator();
        int targetsHealth = target.getHealthPoints();
        target.setHealthPoints(targetsHealth + healthPointManipulationInt);
    }

    public void clearfamiliarInventory() {
        this.familiarInventory.clear();
    }

    public void clearSpellInventory() {
        this.spellInventory.clear();
    }
}
