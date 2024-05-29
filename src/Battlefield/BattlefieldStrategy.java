package Battlefield;

import Army.Army;

public interface BattlefieldStrategy {

    void attack(Army attacker, Army defender);

    void show(Army attacker, Army defender);
}
