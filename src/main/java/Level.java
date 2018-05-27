import Enums.RoomType;
import Players.PlayerCharacter;

import java.util.ArrayList;

public class Level {
    private RoomType roomType;
    private ArrayList<PlayerCharacter> playersInRoom;


    public Level(RoomType roomType){
        this.roomType = roomType;
        this.playersInRoom = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getReward(){
        return this.roomType.getReward();
    }

    public String getRoomBeast(){
        return this.roomType.getRoomBeast();
    }

    public int getLevelReward(){
        return this.getReward();
    }

    public int playerCharacterInRoomCount() {
        return this.playersInRoom.size();
    }

    public void addPlayerCharacterToRoom(PlayerCharacter player) {
        this.playersInRoom.add(player);
    }

}

