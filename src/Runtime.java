import Factories.HumanFactory;
import Factories.UndeadFactory;
import Units.Abstract.Unit;

public class Runtime {

    public static void run() {

        HumanFactory humanFactory = new HumanFactory();
        ArmyCreator humanArmyCreator = new ArmyCreator(humanFactory);
        Army humanArmy = humanArmyCreator.createArmy(1000);

        UndeadFactory undeadFactory = new UndeadFactory();
        ArmyCreator undeadArmyCreator = new ArmyCreator(undeadFactory);
        Army undeadArmy = undeadArmyCreator.createArmy(1000);

        Battlefield battlefield = new Battlefield(humanArmy, undeadArmy);

        while (!humanArmy.units.isEmpty() || !undeadArmy.units.isEmpty()) {

            //for (int i = 0; i < pickedArmy.units.size(); ++i) {
                // battlefield.performMeleeAttack();

                //if (logging = true)
                    //log;
            //}
        }
    }
}
