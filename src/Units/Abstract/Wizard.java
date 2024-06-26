package Units.Abstract;

public class Wizard extends Unit implements Range {

    public Wizard(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    @Override
    public void rangeAbility(Unit unit) {
        if (unit instanceof Archer) {
            ((Archer) unit).cloneUnit();
        }
        if (unit instanceof Infantryman) {
            ((Infantryman) unit).cloneUnit();
        }
    }
}
