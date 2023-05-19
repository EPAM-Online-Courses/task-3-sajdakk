package efs.task.oop;

public abstract class Monster implements Fighter{
    protected  int health;
    protected  int damage;

    public Monster(int health, int damage){
        this.damage=damage;
        this.health=health;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

}
