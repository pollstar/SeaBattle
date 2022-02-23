package actions.BattleDesk;

import models.battledesk.Desk;
import models.cells.Cell;
import models.cells.CellStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PlacerShipTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void place_OK() {
    }

    @Test
    void isCellsOverEmpty_InCenterTrue() {
        Desk desk = Mockito.mock(Desk.class);
        Cell[][] cells = new Cell[10][10];
        //Cell cell = ;


        for (int x = 2; x < 4; x++) {
            for (int y = 2; y < 4; y++) {
                cells[x][y] = Mockito.mock(Cell.class);
                Mockito.when(cells[x][y].getCellStatus()).thenReturn(CellStatus.EMPTY);
                Mockito.when(desk.getCells()).thenReturn(cells);
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 3, 3));

    }
}