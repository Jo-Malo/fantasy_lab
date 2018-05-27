package Players;

import Enums.RoomType;
import Interfaces.IManipulateHealthPoints;

import java.util.ArrayList;
import java.util.Collections;

public abstract class PlayerCharacter implements IManipulateHealthPoints {
    private int healthPoints;
    protected RoomType roomType;
    private ArrayList<RoomType> roomTypes;

    public PlayerCharacter(int healthPoints, RoomType roomType) {
        roomTypes = new ArrayList<>();
        this.healthPoints = healthPoints;
        this.roomType = roomType;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getNumberOfRooms(){
        return roomTypes.size();
    }

    public void shuffle(){
        Collections.shuffle(roomTypes);
    }

    public RoomType takeRoom(){
        return roomTypes.remove(0);
    }
}


