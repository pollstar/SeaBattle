package models.ships;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartShipTest {
    private PartShip partShip;

    @BeforeEach
    void setUp () {
        partShip = new PartShip( 5, 6);
    }

    @Test
    void createPart_Ok () {
        System.out.println("Testing class PartShip: createPart_Ok");
        Assertions.assertEquals(partShip.getX(), 5);
        Assertions.assertEquals(partShip.getY(), 6);
    }

    @Test
    void createPart_WithBigCoordinats () {
        System.out.println("Testing class PartShip: createPart_WithBigCoordinats");
        partShip = new PartShip( 10, 10);
        Assertions.assertEquals(partShip.getX(), 0);
        Assertions.assertEquals(partShip.getY(), 0);
    }

    @Test
    void createPart_WithNegativeCoordinats () {
        System.out.println("Testing class PartShip: createPart_WithNegativeCoordinats");
        partShip = new PartShip( -1, -1);
        Assertions.assertEquals(partShip.getX(), 0);
        Assertions.assertEquals(partShip.getY(), 0);
    }

    @Test
    void createPart_StateOk () {
        System.out.println("Testing class PartShip: createPart_Ok");
        Assertions.assertEquals(partShip.getStatePart(), PartState.OK);
    }

}