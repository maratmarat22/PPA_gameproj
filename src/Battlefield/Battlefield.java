package Battlefield;

import Army.Army;

public class Battlefield {

    private BattlefieldStrategy battlefieldStrategy;

    public void setStrategy(BattlefieldStrategy battlefieldStrategy) {
        this.battlefieldStrategy = battlefieldStrategy;
    }

    public void attack(Army attacker, Army defender) {
        battlefieldStrategy.attack(attacker, defender);
    }

    public void display(Army attacker, Army defender) {
        battlefieldStrategy.display(attacker, defender);
    }
}
