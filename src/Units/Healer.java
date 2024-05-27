package Units;

public class Healer extends Unit implements IRange {

    public Healer(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }


    @Override
    public void rangeAbility() {

    }
}
