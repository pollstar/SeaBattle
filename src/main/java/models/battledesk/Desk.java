package models.battledesk;

import actions.BattleDesk.PlacerShip;
import models.cells.Cell;
import models.cells.CellStatus;
import models.ships.Ship;
import models.ships.ShipOrientation;
import models.ships.ShipType;

import java.util.ArrayList;

public class Desk {
    private final Cell[][] cells = new Cell[10][10];
    private final ArrayList<Ship> ships = new ArrayList<Ship>();

    public Desk() {
        for (var y = 0; y < cells.length; y++) {
            for (var x = 0; x < cells[y].length; x++) {
                cells[y][x] = new Cell();
            }
        }
    }

    public boolean placeShip(int x, int y, ShipType type, ShipOrientation orientation) {
        return PlacerShip.place(this, x, y ,type, orientation);
    }

    private boolean isCellsOverEmpty(int x, int y) {
        for (int j = y - 1; j <= y + 1; j++) {
            if (j < 0 || j > 9) {
                continue;
            }
            for (int k = x - 1; k <= x + 1; k++) {
                if (k < 0 || k > 9) {
                    continue;
                }
                if (cells[j][k].getCellStatus() != CellStatus.EMPTY)
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String desk = "   1   2   3   4   5   6   7   8   9   10\n";
        desk += " +---+---+---+---+---+---+---+---+---+---+\n";
        char nameString = 'A';
        for (int y = 0; y < cells.length; y++) {
            desk += nameString + "|";
            nameString++;
            for (int x = 0; x < cells[y].length; x++) {
                desk += " " + cells[y][x].toString() + " |";
            }
            desk += "\n +---+---+---+---+---+---+---+---+---+---+\n";
        }

        return desk;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }
}
