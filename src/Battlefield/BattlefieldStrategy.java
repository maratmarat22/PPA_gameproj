package Battlefield;

import Army.Army;

public interface BattlefieldStrategy {

    void attack(Army attacker, Army defender);

    void display(Army attacker, Army defender);
}
