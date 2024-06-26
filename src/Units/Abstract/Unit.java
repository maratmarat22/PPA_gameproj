package Units.Abstract;

public abstract class Unit {

    private int cost;
    private int health;
    private int damage;
    private int armor;
    private int dodge;

    public Unit(int cost, int health, int damage, int armor, int dodge) {
        this.cost = cost;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.dodge = dodge;
    }

    public Unit(Unit unit) {
        this.armor = unit.armor;
        this.dodge = unit.dodge;
        this.cost = unit.cost;
        this.damage = unit.damage;
        this.health = unit.health;
    }

    public void meleeAttack(Unit unit) {
        // Добавьте сюда конкретную реализацию мили-атаки
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
