package actions.BattleDesk;

import models.battledesk.Desk;
import models.ships.*;

import java.util.Random;

public class SetShipsRandom {
    public SetShipsRandom(Desk desk) {
        ShipsArray shipsTypeArray = new ShipsArray();
        Random rnd = new Random();
        for (ShipType shipType: shipsTypeArray.ships) {
            while(!desk.placeShip(rnd.nextInt(10), rnd.nextInt(10), shipType,
                    ShipOrientation.values()[rnd.nextInt(ShipOrientation.values().length)])){};
        }
    }
}
