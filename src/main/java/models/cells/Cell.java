package models.cells;

import models.ships.PartShip;
import models.ships.Ship;

public class Cell {
    private CellStatus cellStatus = CellStatus.EMPTY;
    private Ship ship=null;

    @Override
    public String toString() {
        return cellStatus.getCell();
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
