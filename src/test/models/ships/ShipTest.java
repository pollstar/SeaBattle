package models.ships;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShipTest {
    Ship ship = new Ship();

    @BeforeEach
    void setUp () {
        ship.addPart(1, 2);
        ship.addPart(1, 3);
        ship.addPart(1, 4);
        ship.addPart(1, 5);
    }

    @Test
    void testAndSetHit() {
        System.out.println("Testing class Ship: testAndSetHit_True");
        Assertions.assertEquals(ship.shipStatus, ShipStatus.OK);
        ship.testAndSetHit(1,2);
        ship.testAndSetHit(1,3);
        Assertions.assertEquals(ship.shipStatus, ShipStatus.INJURED);
        ship.testAndSetHit(1,4);
        ship.testAndSetHit(1,5);
        Assertions.assertEquals(ship.shipStatus, ShipStatus.KILLED);
    }

    @Test
    void getShipStatus_KILLED() {
        System.out.println("Testing class Ship: getShipStatus_KILLED");
        ship.testAndSetHit(1,2);
        ship.testAndSetHit(1,3);
        ship.testAndSetHit(1,4);
        ship.testAndSetHit(1,5);

        Assertions.assertEquals(ship.getShipStatus(), ShipStatus.KILLED);
    }

    @Test
    void getShipStatus_INJURED() {
        System.out.println("Testing class Ship: getShipStatus_INJURED");
        ship.testAndSetHit(1,1);
        ship.testAndSetHit(1,3);
        Assertions.assertEquals(ship.getShipStatus(), ShipStatus.INJURED);
        ship.testAndSetHit(1,4);
        Assertions.assertEquals(ship.getShipStatus(), ShipStatus.INJURED);
        ship.testAndSetHit(1,5);
        Assertions.assertEquals(ship.getShipStatus(), ShipStatus.INJURED);
    }

    @Test
    void getShipStatus_OK() {
        System.out.println("Testing class Ship: getShipStatus_OK");
        ship.testAndSetHit(1,0);
        ship.testAndSetHit(9,3);
        ship.testAndSetHit(19,-3);
        Assertions.assertEquals(ship.getShipStatus(), ShipStatus.OK);
    }

    @Test
    void addPart_Ok () {
        System.out.println("Testing class Ship: addPart_Ok");
        int i = ship.partsShip.size();
        ship.addPart(1,1);
        Assertions.assertEquals(i+1, ship.partsShip.size());
    }

}