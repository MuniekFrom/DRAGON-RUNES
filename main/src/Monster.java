import java.util.Random;

public class Monster extends Opponent{


    Random random = new Random();

    Monster(){
        this.hp = 400;
    }

    @Override
    public int getMonsterHp(){
        return super.getMonsterHp();
    }


    @Override
    void atack() {
        super.atack();
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

        int randomdmg = random.nextInt(3)+1;
        if (randomdmg >= 2){
            System.out.println("You take damage!");
        }
        else {
            System.out.println("You dodged!");
        }
    }
}