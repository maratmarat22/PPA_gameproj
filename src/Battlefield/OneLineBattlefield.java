package Battlefield;

import Army.Army;
import IO.GameUI;
import Units.Abstract.Archer;
import Units.Abstract.Healer;
import Units.Abstract.Wizard;

public class OneLineBattlefield implements BattlefieldStrategy {

    @Override
    public void attack(Army attacker, Army defender) {

        attacker.units.getLast().meleeAttack(defender.units.getLast());

        for (int i = 0; i < attacker.units.size(); ++i) {

            if (attacker.units.get(i) instanceof Archer)
                ((Archer) attacker.units.get(i)).rangeAbility(defender.units.get(i));

            if (attacker.units.get(i) instanceof Wizard)
                ((Wizard) attacker.units.get(i)).rangeAbility(attacker.units.get(i + 1));

            if (attacker.units.get(i) instanceof Healer) {
                ((Healer) attacker.units.get(i)).rangeAbility(attacker.units.get(i - 1));
                ((Healer) attacker.units.get(i)).rangeAbility(attacker.units.get(i + 1));
            }
        }
    }

    @Override
    public void display(Army attacker, Army defender) {

        GameUI.displayBattlefield(attacker.units.toString(), defender.units.toString());
    }
}

