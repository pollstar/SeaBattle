package models.battledesk;

import models.cells.Cell;
import models.cells.CellStatus;
import models.ships.ShipOrientation;
import models.ships.ShipType;

import java.util.ArrayList;
import java.util.Arrays;

import static models.ships.ShipOrientation.*;

public class Desk {
    private final Cell[][] cells = new Cell[10][10];

    public Desk() {
        for (var y = 0; y < cells.length; y++) {
            for (var x=0; x<cells[y].length; x++) {
                cells[y][x] = new Cell();
            }
        }
    }

    public boolean placeShip(int x, int y, ShipType type, ShipOrientation orientation) {
        ArrayList<Cell> cellTesting = new ArrayList<Cell>();

        for (int i = 0; i < type.getType(); i++) {
            if (cells[y][x].getCellStatus() != CellStatus.EMPTY ||
                    x < 0 || x > 9 || y < 0 || y > 9) {
                return false;
            }
            cellTesting.add(cells[y][x]);

            switch (orientation) {
                case NORTH : y++; break;
                case SOUTH : y--; break;
                case WEST : x++;break;
                case EAST : x--;break;
            }
        }

        for (int i = 0; i < cellTesting.size(); i++) {
            cellTesting.get(i).setCellStatus(CellStatus.SHIP_PART_OK);
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
}
