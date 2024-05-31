import Units.Abstract.Swordsman;

public class ArmorUp extends SwordsmanDecorator{
    Swordsman swordsman;

    public ArmorUp(int cost, int health, int damage, int armor, int dodge, Swordsman swordsman) {
        super(cost, health, damage, armor, dodge);
        this.swordsman = swordsman;
    }

    @Override
    public int getArmor() {
        return swordsman.getArmor() + 20;
    }
}
