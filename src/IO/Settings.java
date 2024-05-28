package IO;

import Configuration.ConfigManager;
import java.util.Scanner;

public class Settings {

    public static String show(ConfigManager configManager, Scanner sc) {

        System.out.println("SETTINGS:");
        System.out.printf("1. Logging (%s)\n", ConfigManager.returnParamValueString(configManager, "Logging"));
        System.out.println("0. To main menu");

        char option = sc.next().charAt(0);

        return switch (option) {
            case '1' -> "Logging";
            default -> null;
        };
    }
}
