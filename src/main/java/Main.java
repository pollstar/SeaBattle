import actions.BattleDesk.SetShipsRandom;
import models.battledesk.Desk;

public class Main {
    public static void main(String[] args) {
        System.out.println("SeaBattle");
//        Rules.printRules();
        Desk desk = new Desk();
        new SetShipsRandom(desk);

        System.out.println(desk);
    }
}
