
package Battlefield;

import Army.Army;
import Units.Abstract.Unit;
import java.util.Arrays;

public class ThreeLineBattlefield implements BattlefieldStrategy {

    @Override
    public void attack(Army attacker, Army defender) {

    }

    @Override
    public void display(Army attacker, Army defender) {
        //Перенос всего в массивы
        Unit[] AttackerArr = new Unit[attacker.getNumberOfUnits()];
        Unit[] DefenderArr = new Unit[defender.getNumberOfUnits()];
        int i = 0;
        for (Unit unit : attacker.units) {
            AttackerArr[i] = unit;
            i++;
        }
        int j = 0;
        for (Unit unit : defender.units) {
            DefenderArr[i] = unit;
            j++;
        }
// Разделение на 3 для атаки
        int lengthAttacker = AttackerArr.length;
        int thirdAttacker = lengthAttacker / 3;
        int remainderAttacker = lengthAttacker % 3;

        if (remainderAttacker == 0) {
            Unit[] firstAttackerLine = Arrays.copyOfRange(AttackerArr, 0, thirdAttacker);
            Unit[] secondAttackerLine = Arrays.copyOfRange(AttackerArr, thirdAttacker, 2 * thirdAttacker);
            Unit[] thirdAttackerLine = Arrays.copyOfRange(AttackerArr, 2 * thirdAttacker, lengthAttacker);

        } else {
            Unit[] firstAttackerLine= Arrays.copyOfRange(AttackerArr, 0, thirdAttacker + 1);
            Unit[] secondAttackerLine = Arrays.copyOfRange(AttackerArr, thirdAttacker + 1, 2 * thirdAttacker + 1);
            Unit[] thirdAttackerLine = Arrays.copyOfRange(AttackerArr, 2 * thirdAttacker + 1, lengthAttacker);
        }

        //Разделение на 3 для защиты
        int lengthDefender = DefenderArr.length;
        int thirdDefender = lengthDefender / 3;
        int remainderDefender = lengthDefender % 3;

        if (remainderDefender == 0) {
            Unit[] firstDefenderLine = Arrays.copyOfRange(DefenderArr, 0, thirdDefender);
            Unit[] secondDefenderLine = Arrays.copyOfRange(DefenderArr, thirdDefender, 2 * thirdDefender);
            Unit[] thirdDefenderLine = Arrays.copyOfRange(DefenderArr, 2 * thirdDefender, lengthDefender);

        } else {
            Unit[] firstDefenderLine = Arrays.copyOfRange(DefenderArr, 0, thirdDefender + 1);
            Unit[] secondDefenderLine = Arrays.copyOfRange(DefenderArr, thirdDefender + 1, 2 * thirdDefender + 1);
            Unit[] thirdDefenderLine = Arrays.copyOfRange(DefenderArr, 2 * thirdDefender + 1, lengthDefender);
        }

        // Здесь карочи ээ надо разделить два линкедлиста на 6 строк и отправить их в
        // перегрузку метода GUI.displayBattlefield
    }
}
