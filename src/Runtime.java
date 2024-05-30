import Army.*;
import Factories.*;
import Battlefield.*;
import IO.GameUI;

public class Runtime {

    public static void run() {

        ArmyCreator armyCreator = new ArmyCreator();

        armyCreator.setUnitFactory(new HumanFactory());
        Army humanArmy = armyCreator.createArmy(1000);

        armyCreator.setUnitFactory(new UndeadFactory());
        Army undeadArmy = armyCreator.createArmy(1000);

        Battlefield battlefield = new Battlefield();
        battlefield.setStrategy(new OneLineBattlefield());

        while (!humanArmy.units.isEmpty() || !undeadArmy.units.isEmpty()) {

            // Вызов метода отображения армий
            battlefield.display(humanArmy, undeadArmy);

            // Вызов метода меню
            GameUI.displayMenu();

            // Обработка команд меню
            // Команды меню:
            // Сделать ход
            // Вернуться на ход назад
            // Выйти в главное меню

            //for (int i = 0; i < pickedArmy.units.size(); ++i) {
                // battlefield.performMeleeAttack();

                //if (logging = true)
                    //log;
            //}
        }
    }
}
