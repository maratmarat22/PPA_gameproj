import Units.abstracts.Infantryman;
import Units.abstracts.Unit;
import factory.UnitFactory;

import java.util.LinkedList;

public class LightArmy implements ArmyMaker{
    private final UnitFactory unitFactory;

    public LightArmy(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    @Override
    public Army createArmy(int money) {
        LinkedList<Unit> units = new LinkedList<>();
        while (money > 0){
            Infantryman lightUnit = unitFactory.createInfantryman();
            units.push(lightUnit);
            money -= lightUnit.getCost();
        }
        return new Army(units);
    }
}
