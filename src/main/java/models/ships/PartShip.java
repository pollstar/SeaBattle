package models.ships;

public class PartShip {
    private int x, y;
    private StatePart statePart = StatePart.OK;

    PartShip(int x, int y) {
        setX(x);
        setY(y);
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

    public void setStatePart(StatePart statePart) {
        this.statePart = statePart;
    }

    public StatePart getStatePart() {
        return statePart;
    }

}
