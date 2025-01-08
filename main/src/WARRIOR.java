import java.util.Random;

public class WARRIOR extends Person{

    int restStronger = 0;

    int restSpecial = 0;


    Opponent opponent = new Monster();
    int monsterhp = opponent.getMonsterHp();

    public WARRIOR(){
        this.hp = 100;
        this.energy = 50;
        this.atackdmg = 35;
        this.strongeratackdmg = 90;
        this.specialatackdmg = 200;

    }

    Random random = new Random();
    @Override
    void atack() {
        if (energy > 0){
            System.out.println("WARRIOR USING SLASH ATACK!");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            energy -=5;
            //Zmniejszenie czasu odnowienia
            restStronger = Math.max(0, restStronger - 1);
            restSpecial = Math.max(0, restSpecial - 1);
            int randomSlash = random.nextInt(6)+1;
            if (randomSlash >= 2){
                System.out.println("Good atack!");
                System.out.println(atackdmg+ " DAMAGE");
                monsterhp -= atackdmg;
            }
            else {
                System.out.println("DODGE!");
            }
        }
        else {
            System.out.println("NEED REST!");
        }
    }

    @Override
    void atackStronger() {
        if (energy >= 15 && restStronger == 0){
            System.out.println("WARRIOR USING POWER STRIKE ATACK!");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            energy -=15;
            restStronger += 2;
            restSpecial = Math.max(0, restSpecial - 1);
            int randomPower = random.nextInt(6)+1;
            if (randomPower >= 4){
                System.out.println("Good atack!");
                System.out.println(strongeratackdmg+ " DAMAGE!");
                monsterhp -= strongeratackdmg;
            }
            else {
                System.out.println("DODGE!");
            }
        }
        else if(energy <= 14 && restStronger == 0){
            System.out.println("NEED MORE ENERGY!");
        }
        else if (energy >= 15 && restStronger > 0){
            System.out.println("You need " + restStronger + " more ture to use this atack!");
        }
        else if (energy <= 14 && restStronger > 0 ){
            System.out.println("NEED MORE ENERGY!");
            System.out.println("You need " + restStronger + " more ture to use this atack!");
        }
    }

    @Override
    void atackSpecial() {
        if (energy >= 25 && restSpecial == 0){
            System.out.println("WARRIOR USING MONSTER SLAYER ATACK!");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            energy -=25;
            restStronger = Math.max(0, restStronger - 1);
            restSpecial +=2;
            int randomPower = random.nextInt(6)+1;
            if (randomPower >= 5){
                System.out.println("Good atack!");
                System.out.println(specialatackdmg + " DAMAGE!!!");
                monsterhp -= specialatackdmg;
            }
            else {
                System.out.println("DODGE!");
            }
        }
        else if(energy <= 14 && restSpecial == 0){
            System.out.println("NEED MORE ENERGY!");
        }
        else if (energy >= 25 && restSpecial > 0){
            System.out.println("You need " + restSpecial + " more ture to use this atack!");
        }
        else if (energy <= 24 && restSpecial > 0 ){
            System.out.println("NEED MORE ENERGY!");
            System.out.println("You need " + restSpecial + " more ture to use this atack!");
        }

    }

    @Override
    void rest() {
        System.out.println("You get rest!");
        energy = 50;
    }

    @Override
    public void showstats() {
        System.out.println("YOUR STATS");
        System.out.println("HP: " + this.hp + "\nENERGY: " + this.energy);
    }

    @Override
    public void showmonsterhp(){
        System.out.println("Monster HP: " + monsterhp);
    }

    public int oponenthp(){
        return monsterhp;
    }


}