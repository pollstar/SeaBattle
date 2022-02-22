package models.ships;

public abstract class Ship {
    protected PartShip[] partsShip;
    protected ShipStatus shipStatus = ShipStatus.OK;

    public Ship(ShipType shipType) {
        partsShip = new PartShip[shipType.getType()];
    }

    protected abstract boolean placeShip(int x, int y, ShipOrientation shipOrientation) ;

    public boolean testAndSetHit(int x, int y) {
        for (PartShip part: partsShip) {
            if (part.getX() == x && part.getY() == y) {
                part.setStatePart(PartState.BROKE);
                shipStatus = ShipStatus.INJURED;
                testAndSetKill();
                return true;
            }
        }
        return false;
    }

    private void testAndSetKill () {
        if (shipStatus == ShipStatus.KILLED) {
            return;
        }
        for (PartShip part: partsShip) {
            if (part.getStatePart() == PartState.OK) {
                return;
            }
        }
        shipStatus = ShipStatus.KILLED;
    }

    public ShipStatus getShipStatus() {
        return shipStatus;
    }
}
