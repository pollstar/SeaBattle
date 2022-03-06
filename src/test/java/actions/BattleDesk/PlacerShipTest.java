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
        Cell cell = Mockito.mock(Cell.class);

        Cell[][] cells = new Cell[10][10];
        Mockito.when(cell.getCellStatus()).thenReturn(CellStatus.EMPTY);
        Mockito.when(desk.getCells()).thenReturn(cells);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                cells[x][y] = cell;
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 3, 3));

        System.out.println("Testing class PlacerShip: isCellsOverEmpty_InCenterTrue");
    }

    @Test
    void isCellsOverEmpty_InBottom() {
        Desk desk = Mockito.mock(Desk.class);
        Cell cell = Mockito.mock(Cell.class);

        Cell[][] cells = new Cell[10][10];
        Mockito.when(cell.getCellStatus()).thenReturn(CellStatus.EMPTY);
        Mockito.when(desk.getCells()).thenReturn(cells);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                cells[x][y] = cell;
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 3, 9));

        System.out.println("Testing class PlacerShip: isCellsOverEmpty_InBottom");
    }

    @Test
    void isCellsOverEmpty_InUp() {
        Desk desk = Mockito.mock(Desk.class);
        Cell cell = Mockito.mock(Cell.class);

        Cell[][] cells = new Cell[10][10];
        Mockito.when(cell.getCellStatus()).thenReturn(CellStatus.EMPTY);
        Mockito.when(desk.getCells()).thenReturn(cells);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                cells[x][y] = cell;
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 3, 0));

        System.out.println("Testing class PlacerShip: isCellsOverEmpty_InUp");
    }

    @Test
    void isCellsOverEmpty_InRight() {
        Desk desk = Mockito.mock(Desk.class);
        Cell cell = Mockito.mock(Cell.class);

        Cell[][] cells = new Cell[10][10];
        Mockito.when(cell.getCellStatus()).thenReturn(CellStatus.EMPTY);
        Mockito.when(desk.getCells()).thenReturn(cells);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                cells[x][y] = cell;
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 0, 4));

        System.out.println("Testing class PlacerShip: isCellsOverEmpty_InRight");
    }

    @Test
    void isCellsOverEmpty_InLeft() {
        Desk desk = Mockito.mock(Desk.class);
        Cell cell = Mockito.mock(Cell.class);

        Cell[][] cells = new Cell[10][10];
        Mockito.when(cell.getCellStatus()).thenReturn(CellStatus.EMPTY);
        Mockito.when(desk.getCells()).thenReturn(cells);

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                cells[x][y] = cell;
            }
        }
        Assertions.assertTrue(PlacerShip.isCellsOverEmpty(desk, 9, 4));

        System.out.println("Testing class PlacerShip: isCellsOverEmpty_InLeft");
    }
}