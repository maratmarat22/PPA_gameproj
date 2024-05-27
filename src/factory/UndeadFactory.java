package factory;

import Units.abstracts.*;
import Units.concrete.undead.*;

public class UndeadFactory implements UnitFactory {
    @Override
    public Swordsman createSwordsman() {
        return new UndeadSwordsman();
    }

    @Override
    public Archer createArcher() {
        return new UndeadArcher();
    }

    @Override
    public Healer createHealer() {
        return new UndeadHealer();
    }

    @Override
    public Infantryman createInfantryman() {
        return new UndeadInfantry();
    }

    @Override
    public Wizard createWizard() {
        return new UndeadWizard();
    }
}
