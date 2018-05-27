package Players;

import Enums.RoomType;
import Tools.Item;
import Tools.MeleeWeapon;

import java.util.ArrayList;

public class Fighter extends PlayerCharacter {
    private ArrayList<MeleeWeapon> meleeWeaponInventory;
    protected RoomType roomType;

    public Fighter(int healthPoints, RoomType roomType){
        super(healthPoints, roomType);
        meleeWeaponInventory = new ArrayList<>();
    }

    public int getMeleeWeaponInventoryCount() {
        return this.meleeWeaponInventory.size();
    }

    public void addMeleeWeapontoInventory(MeleeWeapon meleeWeapon) {
        this.meleeWeaponInventory.add(meleeWeapon);
    }

    public void manipulateHeathPoints(PlayerCharacter target) {
        Item equippedItem = this.meleeWeaponInventory.get(0);
        int healthPointManipulationInt = equippedItem.getHealthPointManipulator();
        int targetsHealth = target.getHealthPoints();
        target.setHealthPoints(targetsHealth + healthPointManipulationInt);
    }

    public void clearMeleeWeaponInventory() {
        this.meleeWeaponInventory.clear();
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
}
