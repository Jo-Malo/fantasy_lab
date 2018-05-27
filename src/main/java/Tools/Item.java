package Tools;

public class Item {
    private int healthPointManipulator;

    public Item(int healthPointManipulator) {
        this.healthPointManipulator = healthPointManipulator;
    }

    public int getHealthPointManipulator() {
        return this.healthPointManipulator;
    }

    public void setHealthPointManipulator(int newHealthPointManipulator) {
        this.healthPointManipulator = newHealthPointManipulator;
    }
}
