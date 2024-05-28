import Units.Abstract.Unit;
import java.util.LinkedList;
import java.util.Objects;

public class Army {
  
    public LinkedList<Unit> units;

    public Army(LinkedList<Unit> units) {
        this.units = units;
    }

    public void attackEnemyArmy(Army enemies){
      
        Objects.requireNonNull(units.peek()).meleeAttack(enemies.units.peek());
    }
}
