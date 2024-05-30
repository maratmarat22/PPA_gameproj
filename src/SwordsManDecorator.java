import Units.Abstract.Swordsman;

public abstract class SwordsManDecorator extends Swordsman {

    public SwordsManDecorator(int cost, int health, int damage, int armor, int dodge) {
        super(cost, health, damage, armor, dodge);
    }

    public abstract int getArmor();
}
