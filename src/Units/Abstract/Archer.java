package Units.Abstract;

public class Archer extends Unit implements Range, ICloneable {

    public Archer(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    public Archer(Unit unit) {
        super(unit);
    }

    @Override
    public void rangeAbility(Unit unit) {

    }

    @Override
    public Archer cloneUnit() {
        return new Archer(this);
    }
}
