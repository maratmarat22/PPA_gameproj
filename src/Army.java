import Units.abstracts.Unit;

import java.util.LinkedList;
import java.util.Objects;

public class Army {
    public LinkedList<Unit> army;

    public Army(LinkedList<Unit> army) {
        this.army = army;
    }

    public void attackEnemyArmy(Army enemies){
        Objects.requireNonNull(army.peek()).meleeAttack(enemies.army.peek());
    }
}
