import IO.*;
import Configuration.*;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String option = MainMenu.show(sc);
        switch(option) {
            case "runtime":
                //... здесь вызов функции runtime
                break;

            case "settings":

                ConfigManager configManager = new ConfigManager("C:\\Users\\akhmy\\Documents\\Projects\\IntelliJ IDEA\\Menu\\src\\Configuration\\Settings.txt");

                String param = Settings.show(configManager, sc);
                while (param != null) {
                    configManager.switchParam(param);
                    param = Settings.show(configManager, sc);
                }

                break;

            case "exit": System.exit(0);

            default: main(args);
        }

        main(args);
    }
}
