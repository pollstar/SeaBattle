import models.battledesk.Desk;
import models.ships.ShipOrientation;
import models.ships.ShipType;

public class Main {
    public static void main(String[] args) {
        System.out.println("SeaBattle");
        Rules.printRules();
        Desk desk = new Desk();
        desk.placeShip(5,5, ShipType.FOUR, ShipOrientation.NORTH);
        System.out.println(desk);
    }
}
