package efs.task.oop;

public  class Monsters {
    static final Monster andariel = new Monster(10,70){
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.damage);
        }

        @Override
        public void takeHit(int damage) {
            this.damage -=damage;
            Monsters.monstersHealth-=damage;
        }
    };

    static final  Monster blacksmith= new Monster(100,25){
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.damage);
        }
        @Override
        public void takeHit(int damage) {
            this.damage -=(damage+5);
            Monsters.monstersHealth-=(damage+5);
        }
    }; ;

    static int monstersHealth= andariel.getHealth()+blacksmith.getHealth();

}
