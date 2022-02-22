package models.cells;

import models.ships.PartShip;

public class Cell {
    private CellStatus cellStatus = CellStatus.EMPTY;

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
}
