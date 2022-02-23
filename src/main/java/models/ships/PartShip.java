package models.ships;

import models.Point;

public class PartShip {
    private int x, y;
    private PartState partState = PartState.OK;

    PartShip(int x, int y) {
        setX(x);
        setY(y);
    }

    PartShip(Point point) {
        setX(point.getX());
        setY(point.getY());
    }

    public void setX ( int x){
        this.x = (x < 0 || x >= 10) ? 0 : x;
    }

    public void setY ( int y){
        this.y = (y < 0 || y >= 10) ? 0 : y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setStatePart(PartState partState) {
        this.partState = partState;
    }

    public PartState getStatePart() {
        return partState;
    }

}
