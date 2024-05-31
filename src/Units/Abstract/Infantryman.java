package Units.Abstract;

public class Infantryman extends Unit implements ICloneable {

    public Infantryman(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    public Infantryman(Unit unit) {
        super(unit);
    }

    @Override
    public Infantryman cloneUnit() {
        return new Infantryman(this);
    }
}
