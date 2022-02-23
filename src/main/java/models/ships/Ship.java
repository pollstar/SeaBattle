package models.ships;

import models.Point;

import java.util.ArrayList;

public class Ship {
    protected ArrayList<PartShip> partsShip;
    protected ShipStatus shipStatus;

    public Ship() {
        partsShip = new ArrayList<PartShip>();
        shipStatus = ShipStatus.OK;
    }

    public boolean testAndSetHit(int x, int y) {
        for (PartShip part : partsShip) {
            if (part.getX() == x && part.getY() == y) {
                part.setStatePart(PartState.BROKE);
                shipStatus = ShipStatus.INJURED;
                testAndSetKill();
                return true;
            }
        }
        return false;
    }

    private void testAndSetKill() {
        if (shipStatus == ShipStatus.KILLED) {
            return;
        }
        for (PartShip part : partsShip) {
            if (part.getStatePart() == PartState.OK) {
                return;
            }
        }
        shipStatus = ShipStatus.KILLED;
    }

    public ShipStatus getShipStatus() {
        return shipStatus;
    }

    public void addPart(int x, int y) {
        partsShip.add(new PartShip(x, y));
    }

    public void addPart(Point point) {
        partsShip.add(new PartShip(point.getX(), point.getY()));
    }
}
