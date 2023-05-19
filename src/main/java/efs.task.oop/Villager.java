package efs.task.oop;

public class Villager implements Fighter{
    String name;
    int age;

    protected int health=100;

    public Villager(String name, int age){
        this.name=name;
        this.age=age;
    }

   public void sayHello(){
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old");
    }

    @Override
    public void attack(Fighter victim) {
        int damage = (int) ((100 - age * 0.5) / 10);
        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        this.health -=damage;
    }


    public int getHealth(){
        return  this.health;
    }

   public String getName(){
        return this.name;
    }
}
