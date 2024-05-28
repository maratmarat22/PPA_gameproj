package Factories;

import Units.Abstract.*;

public interface UnitFactory {

    Swordsman createSwordsman();

    Archer createArcher();

    Healer createHealer();

    Infantryman createInfantryman();

    Wizard createWizard();
}
