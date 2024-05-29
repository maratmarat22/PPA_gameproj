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

    public void show(Army attacker, Army defender) {
        battlefieldStrategy.show(attacker, defender);
    }
}
