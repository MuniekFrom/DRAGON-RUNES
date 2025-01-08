public class Person {

    protected int hp;
    protected int energy;

    public int atackdmg;
    public int strongeratackdmg;
    public int specialatackdmg;
    void atack(){
        System.out.println("Atack!");
    }

    void atackStronger(){
        System.out.println("Atack Stronger!");
    }

    void atackSpecial(){
        System.out.println("Special atack!");
    }

    public void showstats(){
        System.out.println("Show stats!");
    }

    public void showmonsterhp(){
        System.out.println("Show hp");
    }

    public int oponenthp(){
        return hp;
    }

    void rest(){
        System.out.println("You get rest!");
    }

}