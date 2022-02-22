package models.ships;

public abstract class Ship {
    PartShip[] partsShip;

    public Ship(TypeShip typeShip) {
        partsShip = new PartShip[typeShip.getType()];
    }

    protected abstract void placeShip(int x, int y) ;

    public boolean testHit(int x, int y) {
        for (PartShip part: partsShip) {
            if (part.getX() == x && part.getY() == y) {
                return true;
            }
        }
        return false;
    }
}
