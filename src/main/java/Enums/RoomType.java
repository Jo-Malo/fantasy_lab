package Enums;

public enum RoomType {

    HOBBITON("Hobbit", 2),
    ELDORADO("Inca", 5),
    SHANGRILA("Immortal", 1);

    public String beast;
    public int reward;

    RoomType(String beast, int reward) {
        this.beast = beast;
        this.reward = reward;
    }

    public String getRoomBeast(){
        return beast;
    }

    public int getReward(){
        return reward;
    }

}
