import Units.abstracts.Swordsman;
import Units.abstracts.Unit;
import factory.UnitFactory;

import java.util.LinkedList;

public class HeavyArmy implements ArmyMaker {
    private final UnitFactory unitFactory;

    public HeavyArmy(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    @Override
    public Army createArmy(int money) {
        LinkedList<Unit> units = new LinkedList<>();
        while (money > 0) {
            Swordsman heavyUnit = unitFactory.createSwordsman();
            units.push(heavyUnit);
            money -= heavyUnit.getCost();
        }
        return new Army(units);
    }
}
