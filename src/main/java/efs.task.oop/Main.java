package efs.task.oop;


public class Main {
    public static void main(String[] args) {

        Villager kashya = new Villager("Kashya" ,30 );
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara" ,40 ,  ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed" ,50 );
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain" ,85 ,ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv" ,35 );
        Villager flawia = new Villager("Flawia" ,25 );

        Villager[] villagers = {kashya, akara, gheed, deckardCain, warriv, flawia};

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;
      //  objectAkara.sayHello(); -error, nie mamy dostepu do metod klasy ExtraordinaryVillager



        // Epicka bitwa
        while(Monsters.monstersHealth>0){
            // Atak osadnik -> potwór
            for (Villager villager : villagers) {
                if (villager.getHealth() <= 0) {
                    continue; // Pomijaj martwych osadników
                }

                System.out.println("Aktualnie walczacy osadnik to " + villager.getName());

                // Atak osadników
                villager.attack(Monsters.andariel);
                villager.attack(Monsters.blacksmith);

                // Sprawdzenie stanu potworów
                if (Monsters.andariel.getHealth() <= 0) {
                    System.out.println("Andariel została pokonana.");
                }
                if (Monsters.blacksmith.getHealth() <= 0) {
                    System.out.println("Blacksmith został pokonany.");
                }
            }

            // Wyjście z pętli, gdy potwory zostały pokonane
            if (Monsters.monstersHealth <= 0) {
                break;
            }

            // Sprawdzenie stanu potworów
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punktow zycia.");

            // Sprawdzenie stanu potworów
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punktów zycia.");

            // Atak potwór -> osadnik
            for (Villager villager : villagers) {
                if (villager.getHealth() <= 0) {
                    continue; // Pomijaj martwych osadników
                }

                System.out.println("Aktualnie walczacy osadnik to " + villager.getName());

                // Atak potworów
                Monsters.andariel.attack(villager);
                Monsters.blacksmith.attack(villager);

                // Sprawdzenie stanu osadnika
                if (villager.getHealth() <= 0) {
                    System.out.println(villager.getName() + " został pokonany.");
                }
            }
        }

        System.out.println("Obozowisko ocalone!");

        // Przywrócenie mocy ExtraordinaryVillager'om
        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        // Wywołanie metod z klasy ExtraordinaryVillager
        deckardCain.sayHello();
        akara.sayHello();
    }
}
