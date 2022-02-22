package models.ships;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShipTest {
    Ship ship = new Ship(ShipType.FOUR) {
        @Override
        protected boolean placeShip(int x, int y, ShipOrientation shipOrientation) {
            this.partsShip[0] = new PartShip(1,2);
            this.partsShip[1] = new PartShip(1,3);
            this.partsShip[2] = new PartShip(1,4);
            this.partsShip[3] = new PartShip(1,5);
            return true;
        }
    };

    @BeforeEach
    void setUp () {
        ship.placeShip(1,1, ShipOrientation.NORTH);
    }

    @Test
    void testAndSetHit_True() {
        System.out.println("Testing class Ship: testAndSetHit_True");
        Assertions.assertTrue(ship.testAndSetHit(1,2));
        Assertions.assertTrue(ship.testAndSetHit(1,3));
        Assertions.assertTrue(ship.testAndSetHit(1,4));
        Assertions.assertTrue(ship.testAndSetHit(1,5));
    }

    @Test
    void testAndSetHit_False() {
        System.out.println("Testing class Ship: testAndSetHit_False");
        Assertions.assertFalse(ship.testAndSetHit(3,2));
        Assertions.assertFalse(ship.testAndSetHit(5,3));
        Assertions.assertFalse(ship.testAndSetHit(7,4));
        Assertions.assertFalse(ship.testAndSetHit(8,5));
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
}