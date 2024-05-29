package Army;

import Factories.UnitFactory;
import java.util.LinkedList;
import Units.Abstract.*;
import IO.ArmyCreationUI;
import java.lang.reflect.*;

public class ArmyCreator {

    private UnitFactory unitFactory;

    public void setUnitFactory(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    public Army createArmy(int budget) {

        LinkedList<Unit> units = new LinkedList<>();

        while (budget > 0) {

            String unitType = ArmyCreationUI.show(budget, units.toString());

            if (unitType != null) {
                try {
                    Method factoryMethod = unitFactory.getClass().getMethod("create" + unitType);
                    Unit unit = (Unit)factoryMethod.invoke(unitFactory);

                    // Впоследствии уберите отсюда выводы в консоль

                    if (unit.getCost() <= budget) {
                        units.add(unit);
                        budget -= unit.getCost();
                        System.out.println("Unit " + unitType + " added to the army.");
                    } else {
                        System.out.println("Not enough budget to create a " + unitType + ".");
                    }
                }
                catch (Exception e) {
                    System.out.println("Error creating unit: " + unitType);
                }
            }
        }

        return new Army(units);
    }
}
