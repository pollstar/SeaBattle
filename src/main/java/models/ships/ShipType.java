package models.ships;

public enum ShipType {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    BOMB(1);

    private int type;
    ShipType(int i) {
        this.type = i;
    }

    public int getType() {
        return type;
    }
}
