package models.ships;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship = new Ship(TypeShip.FOUR) {
        @Override
        protected void placeShip(int x, int y) {
            this.partsShip[0] = new PartShip(1,2);
            this.partsShip[1] = new PartShip(1,3);
            this.partsShip[2] = new PartShip(1,4);
            this.partsShip[3] = new PartShip(1,5);
        }
    };

    @BeforeEach
    void setUp () {
    }
    @Test

    void testHit_Ок() {
        Assertions.assertTrue(ship.testHit(1,2));
        Assertions.assertTrue(ship.testHit(1,3));
        Assertions.assertTrue(ship.testHit(1,4));
        Assertions.assertTrue(ship.testHit(1,5));
    }

}