package Battlefield;

import Army.Army;

public class ThreeLineBattlefield implements BattlefieldStrategy {

    @Override
    public void attack(Army attacker, Army defender) {

    }

    @Override
    public void display(Army attacker, Army defender) {

        // Здесь карочи ээ надо разделить два линкедлиста на 6 строк и отправить их в
        // перегрузку метода GUI.displayBattlefield
    }
}
