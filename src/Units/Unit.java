package Units;

public abstract class Unit {

    int cost;
    int health;
    int damage;
    int armor;
    int dodge;

    public Unit(int cost, int health, int damage, int armor, int dodge) {
        this.cost = cost;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.dodge = dodge;
    }

    public void meleeAttack() {
        // Добавьте сюда конкретную реализацию мили-атаки
    }
}
