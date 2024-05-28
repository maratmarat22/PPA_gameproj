package Units.Abstract;

public class Archer extends Unit implements Range, ICloneable {

    public Archer(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void rangeAbility() {

    }

    @Override
    public void cloneUnit() {

    }
}
