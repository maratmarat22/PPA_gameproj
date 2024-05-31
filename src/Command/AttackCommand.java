package Command;

import Battlefield.Battlefield;
import Army.Army;

public class AttackCommand implements Command {

    private final Battlefield battlefield;
    private final Army attacker;
    private final Army defender;

    public AttackCommand(Battlefield battlefield, Army attacker, Army defender) {

        this.battlefield = battlefield;
        this.attacker = attacker;
        this.defender = defender;
    }

    public void execute() {

        battlefield.attack(attacker, defender);
    }
}
