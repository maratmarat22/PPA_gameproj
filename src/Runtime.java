import Army.*;
import Factories.*;
import Battlefield.*;

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

            //for (int i = 0; i < pickedArmy.units.size(); ++i) {
                // battlefield.performMeleeAttack();

                //if (logging = true)
                    //log;
            //}
        }
    }
}
