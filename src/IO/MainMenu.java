package IO;

import java.util.Scanner;

public class MainMenu {

    public static String show(Scanner sc) {

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
}
