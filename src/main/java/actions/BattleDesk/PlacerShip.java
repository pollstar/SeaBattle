package actions.BattleDesk;

import models.Point;
import models.battledesk.Desk;
import models.cells.*;
import models.ships.*;

import java.util.HashMap;
import java.util.Map;

public final class PlacerShip {
    public static boolean place(Desk desk, int x, int y, ShipType shipType, ShipOrientation shipOrientation) {
        Map<Point, Cell> cellTesting = new HashMap<>();

        for (int i = 0; i < shipType.getType(); i++) {
            if (x < 0 || x > 9 || y < 0 || y > 9) {
                return false;
            }
            if (!isCellsOverEmpty(desk, x, y)) return false;
            cellTesting.put(new Point(x, y), desk.getCells()[x][y]);

            switch (shipOrientation) {
                case NORTH: y++; break;
                case SOUTH: y--; break;
                case WEST: x++; break;
                case EAST: x--; break;
            }
        }
        Ship newShip = new Ship();
        desk.getShips().add(newShip);

        for (Map.Entry<Point, Cell> entry : cellTesting.entrySet()) {
            newShip.addPart(entry.getKey());
            entry.getValue().setCellStatus(shipType == ShipType.BOMB ? CellStatus.BOMB_OK : CellStatus.SHIP_PART_OK);
        }
        return true;
    }

    protected static boolean isCellsOverEmpty(Desk desk, int x, int y) {
        for (int j = y - 1; j <= y + 1; j++) {
            if (j < 0 || j > 9) {
                continue;
            }
            for (int k = x - 1; k <= x + 1; k++) {
                if (k < 0 || k > 9) {
                    continue;
                }
                if (desk.getCells()[j][k].getCellStatus() != CellStatus.EMPTY)
                    return false;
            }
        }
        return true;
    }
}

