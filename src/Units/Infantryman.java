package Units;

public class Infantryman extends Unit implements IClonable {

    public Infantryman(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void cloneUnit() {

    }
}
