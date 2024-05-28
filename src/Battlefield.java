import Units.Abstract.Unit;

public class Battlefield {

    private Army army1;
    private Army army2;
    private String strategy;

    public Battlefield(Army army1, Army army2) {
        this.army1 = army1;
        this.army2 = army2;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void performMeleeAttack(Unit unit1, Unit unit2) {

    }

    public void performRangeAbility(Unit unit1, Unit unit2) {

    }
}
