package actions.BattleDesk;

import models.ships.ShipType;

import java.util.ArrayList;

public class ShipsArray {
    public ArrayList<ShipType> ships = new ArrayList<>();

    public ShipsArray() {
        this.ships.add(ShipType.FOUR);
        this.ships.add(ShipType.THREE);
        this.ships.add(ShipType.THREE);
        this.ships.add(ShipType.TWO);
        this.ships.add(ShipType.TWO);
        this.ships.add(ShipType.TWO);
        this.ships.add(ShipType.ONE);
        this.ships.add(ShipType.ONE);
        this.ships.add(ShipType.ONE);
        this.ships.add(ShipType.ONE);
        this.ships.add(ShipType.BOMB);
        this.ships.add(ShipType.BOMB);
    }
}
