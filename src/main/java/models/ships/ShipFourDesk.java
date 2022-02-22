package models.ships;

public class ShipFourDesk extends Ship{

    public ShipFourDesk() {
        super(ShipType.FOUR);
    }

    protected boolean placeShip(int x, int y, ShipOrientation shipOrientation) {
        return true;
    };
}
