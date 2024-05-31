import IO.*;
import Configuration.*;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        UIManager UI = new UIManager(sc);

        ConfigManager configManager = new ConfigManager("src\\Configuration\\Settings.txt");

        String option = UI.displayMainMenu();

        switch(option) {

            case "runtime":
                Runtime runtime = new Runtime(UI, configManager);
                runtime.run();
                break;

            case "settings":
                String param = UI.displaySettings(configManager);
                while (param != null) {
                    configManager.switchParam(param);
                    param = UI.displaySettings(configManager);
                }
                break;

            case "exit": System.exit(0);

            default: main(args);
        }

        main(args);
    }
}

