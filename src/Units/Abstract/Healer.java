package Units.Abstract;

public class Healer extends Unit implements Range {

    public Healer(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void rangeAbility(Unit unit) {
        unit.setHealth(unit.getHealth());
    }
}
