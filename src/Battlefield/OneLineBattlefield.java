package Battlefield;

import Army.Army;
import IO.GameUI;

public class OneLineBattlefield implements BattlefieldStrategy {

    @Override
    public void attack(Army attacker, Army defender) {

    }

    @Override
    public void display(Army attacker, Army defender) {
        GameUI.displayBattlefield(attacker.units.toString(), defender.units.toString());
    }
}

