package efs.task.oop;

public class ExtraordinaryVillager extends Villager{
    Skill skill;

    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        public final String label;

        private Skill(String label) {
            this.label = label;
        }
    }

    public ExtraordinaryVillager(String name, int age, Skill skill){
        super(name, age);
        this.skill=skill;
    }


  public void sayHello(){
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old. " + this.skill.label);
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    @Override
    public void takeHit(int damage) {
        this.health=0;
    }
}

