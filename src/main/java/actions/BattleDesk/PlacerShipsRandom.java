package actions.BattleDesk;

import models.battledesk.Desk;
import models.ships.ShipOrientation;
import models.ships.ShipType;

public class PlacerShipsRandom {
    public PlacerShipsRandom(Desk desk) {
        ShipsArray shipsTypeArray = new ShipsArray();
//        for (ShipType shipType: shipsTypeArray.ships) {
//
//        }
        desk.placeShip(5,5,ShipType.FOUR, ShipOrientation.NORTH);
    }
}
