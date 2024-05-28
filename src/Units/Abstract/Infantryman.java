package Units.Abstract;

public class Infantryman extends Unit implements ICloneable {

    public Infantryman(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void cloneUnit() {

    }
}
