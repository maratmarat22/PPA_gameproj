package IO;

import Configuration.ConfigManager;

import java.util.Scanner;

public class UIManager {

    Scanner sc;

    public UIManager(Scanner sc) {

        this.sc = sc;
    }

    public String displayMainMenu() {

        System.out.println("MAIN MENU");
        System.out.println("1. Start new game");
        System.out.println("2. Settings");
        System.out.println("3. Exit");

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "runtime";
            case '2' -> "settings";
            case '3' -> "exit";
            default -> "invalid option";
        };
    }

    public String displaySettings(ConfigManager configManager) {

        System.out.println("SETTINGS");
        System.out.printf("1. Logging (%s)\n", ConfigManager.returnParamValueString(configManager, "Logging"));
        System.out.println("0. To main menu");

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "Logging";
            default -> null;
        };
    }

    public String displayArmyCreationUI(int budget, String units) {

        System.out.println("ARMY CREATION UI");
        System.out.println("1. Infantryman - 100");
        System.out.println("2. Archer - 150");
        System.out.println("3. Swordsman - 200");
        System.out.println("4. Healer - 250");
        System.out.println("5. Wizard - 300");
        System.out.println("0. Confirm & continue");

        System.out.println("Gold: " + budget);
        System.out.println("Units: " + units);

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "Infantryman";
            case '2' -> "Archer";
            case '3' -> "Swordsman";
            case '4' -> "Healer";
            case '5' -> "Wizard";
            case '0' -> "Confirm & continue";
            default -> null;
        };
    }

    public String displayGameMenu(int turn) {

        System.out.println("\nTURN: " + turn);
        System.out.println("1. Next turn");
        System.out.println("2. Prev turn");
        System.out.println("3. Switch strategy");
        System.out.println("0. Exit");

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "next";
            case '2' -> "prev";
            case '3' -> "switch";
            default -> null;
        };
    }

    public String displayAttackerChoice() {

        System.out.println("CHOOSE ATTACKER ARMY:");
        System.out.println("1. Human army");
        System.out.println("2. Undead army");

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "human";
            case '2' -> "undead";
            default -> null;
        };
    }
}
