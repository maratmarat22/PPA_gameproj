package factory;

import Units.abstracts.*;
import Units.concrete.humans.*;

public class HumanFactory implements UnitFactory{
    @Override
    public Swordsman createSwordsman() {
        return new HumanSwordsman();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Healer createHealer() {
        return new HumanHealer();
    }

    @Override
    public Infantryman createInfantryman() {
        return new HumanInfantry();
    }

    @Override
    public Wizard createWizard() {
        return new HumanWizard();
    }
}
