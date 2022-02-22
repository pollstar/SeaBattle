package actions.BattleDesk;

import models.battledesk.Desk;
import models.ships.ShipOrientation;
import models.ships.ShipType;

import java.util.Random;

public class PlacerShipsRandom {
    public PlacerShipsRandom(Desk desk) {
        ShipsArray shipsTypeArray = new ShipsArray();
        Random rnd = new Random();
        for (ShipType shipType: shipsTypeArray.ships) {
            while(!desk.placeShip(rnd.nextInt(10), rnd.nextInt(10), shipType,
                    ShipOrientation.values()[rnd.nextInt(ShipOrientation.values().length)])){};
        }
    }
}
