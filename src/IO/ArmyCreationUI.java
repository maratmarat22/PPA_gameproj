package IO;

import java.util.Scanner;

public class ArmyCreationUI {

    public static String display(int budget, String units) {

        System.out.println("ARMY CREATION UI");
        System.out.println("1. Infantryman - 100");
        System.out.println("2. Archer - 150");
        System.out.println("3. Swordsman - 200");
        System.out.println("4. Healer - 250");
        System.out.println("5. Wizard - 300");
        System.out.println("0. Confirm & continue");

        System.out.println("Gold: " + budget);
        System.out.println("Units: " + units);

        Scanner in = new Scanner(System.in);
        char choice = in.next().charAt(0);

        return switch (choice) {
            case '1' -> "Infantryman";
            case '2' -> "Archer";
            case '3' -> "Swordsman";
            case '4' -> "Healer";
            case '5' -> "Wizard";
            case '0' -> "Confirm & continue";
            default -> null;
        };
    }
}
