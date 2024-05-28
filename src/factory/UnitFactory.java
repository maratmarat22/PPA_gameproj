package factory;

import Units.abstracts.*;

public interface UnitFactory {
    Swordsman createSwordsman();

    Archer createArcher();

    Healer createHealer();

    Infantryman createInfantryman();

    Wizard createWizard();
}
