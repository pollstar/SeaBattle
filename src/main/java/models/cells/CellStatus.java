package models.cells;

public enum CellStatus {
    EMPTY(" "),
    SHOT("."),
    SHIP_PART_OK("#"),
    SHIP_PART_BROKE("*"),
    SHIP_PART_KILL("X"),
    BOMB_OK("B"),
    BOMB_BROKE("b");

    private String s;
    CellStatus(String s) {
        this.s = s;
    }

    public String getCell() {
        return this.s;
    }
}
