import Army.*;
import Configuration.ConfigManager;
import Factories.*;
import Battlefield.*;
import Command.*;
import IO.*;

import java.io.IOException;
import java.util.Objects;

public class Runtime {

    UIManager UI;
    ConfigManager configManager;

    public Runtime(UIManager UI, ConfigManager configManager) {

        this.UI = UI;
        this.configManager = configManager;
    }

    public void run() throws IOException {

        ArmyCreator armyCreator = new ArmyCreator();

        armyCreator.setUnitFactory(new HumanFactory());
        Army humanArmy = armyCreator.createArmy(1000, UI);

        armyCreator.setUnitFactory(new UndeadFactory());
        Army undeadArmy = armyCreator.createArmy(1000, UI);

        Battlefield battlefield = new Battlefield();
        battlefield.setStrategy(new OneLineBattlefield());

        CommandManager commandManager = new CommandManager();

        int turn = 1;

        while (!humanArmy.units.isEmpty() || !undeadArmy.units.isEmpty()) {
            
            battlefield.display(humanArmy, undeadArmy);
            
            String command = UI.displayGameMenu(turn);

            switch (command) {

                case "next":
                    String attacker = UI.displayAttackerChoice();

                    if (Objects.equals(attacker, "human"))
                        commandManager.register(new AttackCommand(battlefield, humanArmy, undeadArmy));
                    else
                        commandManager.register(new AttackCommand(battlefield, undeadArmy, humanArmy));

                    ++turn;
                    break;

                case "prev":
                    commandManager.remove();
                    --turn;
                    break;

                case "switch":
                    commandManager.register(new SwitchCommand(battlefield));
                    ++turn;
                    break;
            }

            commandManager.execute();
        }
    }
}

