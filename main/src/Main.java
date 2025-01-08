import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***DRAGON RUNES***");

        Scanner scanner = new Scanner(System.in);

        Opponent opponent;


        String play_quit = null;
        boolean choose_play_quit = false;
        //boolean choose_character = false;
        String character = null;
        Person person;
        boolean destroy_monster = false;
        String warrior_choose = null;

        while (!choose_play_quit){
            System.out.println("PLAY/QUIT");
            play_quit = scanner.nextLine();

            if (play_quit.equalsIgnoreCase("QUIT")){
                System.out.println("Thank you for playing!");
                choose_play_quit = true;
            }
            else if (play_quit.equalsIgnoreCase("PLAY")){

                System.out.println("Choose character: WARRIOR/MAG/HUNTER");
                character = scanner.nextLine();
                if (character.equalsIgnoreCase("WARRIOR")){
                    person = new WARRIOR();
                    System.out.println("WARRIOR vs MONSTER");
                    opponent = new Monster();
                    while (!destroy_monster){
                        int monsterhp = person.oponenthp();
                        if(monsterhp > 0){
                            person.showmonsterhp();
                            person.showstats();
                            System.out.println("SLASH/POWER STRIKE/MONSTER SLAYER/REST");
                            warrior_choose = scanner.nextLine();
                            if (warrior_choose.equalsIgnoreCase("SLASH")){
                                person.atack();
                            }
                            else if (warrior_choose.equalsIgnoreCase("POWER STRIKE")){
                                person.atackStronger();
                            }
                            else if (warrior_choose.equalsIgnoreCase("MONSTER SLAYER")){
                                person.atackSpecial();
                            }
                            else if (warrior_choose.equalsIgnoreCase("REST")){
                                person.rest();
                            }
                        }
                        else {
                            System.out.println("VICTORY!\n***You beat monster!***");
                            destroy_monster = true;
                        }

                    }

                }
                else if (character.equalsIgnoreCase("MAG")){
                    person = new MAG();
                    person.atack();
                }
                else if(character.equalsIgnoreCase("HUNTER")){
                    person = new HUNTER();
                    person.atack();
                }
                else {
                    System.out.println("WRONG CHOICE!");
                }

            }

            //ending chooseplay!
        }



    }
}