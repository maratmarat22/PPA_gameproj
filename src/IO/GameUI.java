package IO;

import java.util.Scanner;
import Units.Abstract.Unit;


/**
* Данный класс содержит методы отображения армий для различных построений и меню.
*/

public class GameUI {
    //все на всех
    public static void displayBattlefield (String army1, String army2) {

            System.out.print(army1);
            System.out.print("\t");
            System.out.print(army2);
    }

    public static void displayBattlefield(Unit[] firstAttackerLine, Unit[] secondAttackerLine, Unit[] thirdAttackerLine, Unit[] firstDefenderLine, Unit[] secondDefenderLine, Unit[] thirdDefenderLine) {


        for (Unit unit : thirdAttackerLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");
        }
        for (Unit unit : secondAttackerLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");
        }
        for (Unit unit : firstAttackerLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");
        }
        System.out.print("\t");

        for (Unit unit : firstDefenderLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");
        }

        for (Unit unit : secondDefenderLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");
        }

        for (Unit unit : thirdDefenderLine) {
            System.out.print(unit.getClass().getSimpleName() + " ");

        }



    }
}
