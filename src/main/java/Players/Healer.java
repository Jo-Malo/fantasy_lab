package Players;

import Enums.RoomType;
import Tools.HealingTool;
import Tools.Item;

import java.util.ArrayList;

public class Healer extends PlayerCharacter{
    private ArrayList<HealingTool> healingToolInventory;

    public Healer(int healthPoints, RoomType roomType){
        super(healthPoints, roomType);
        healingToolInventory = new ArrayList<>();
    }

    public int getHealingToolInventoryCount() {
        return this.healingToolInventory.size();
    }

    public void addHealingToolInventory(HealingTool healingTool) {
        this.healingToolInventory.add(healingTool);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {
        Item equippedItem = this.healingToolInventory.get(0);
        int healthPointManipulationInt = equippedItem.getHealthPointManipulator();
        int targetsHealth = target.getHealthPoints();
        target.setHealthPoints(targetsHealth + healthPointManipulationInt);
    }

    public void clearHealingToolInventory() {
        this.healingToolInventory.clear();
    }
}
