package Units;

public class Wizard extends Unit implements IRange {

    public Wizard(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void rangeAbility() {

    }
}
