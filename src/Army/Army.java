package Army;

import Units.Abstract.Unit;
import java.util.LinkedList;
import java.util.Objects;

public class Army {
  
    public LinkedList<Unit> units;

    public Army(LinkedList<Unit> units) {
        this.units = units;
    }

}
