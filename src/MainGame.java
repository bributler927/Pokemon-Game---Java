import com.sun.tools.javac.Main;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainGame extends CSVReader {
    public int userHealth;

    public static void main(String[] args) {
        MainGame m = new MainGame();
        m.runGame();
    }

    public void runGame() {
        /*introduction();
        Pokemon userPoke = choosestarter();
        int userHealth = userPoke.getHp();*/

        CSVReader csv = new CSVReader();
        List<Pokemon> list = csv.getPokeList();
        System.out.print(list);
        Pokemon enemyPoke = generateEnemy(list);
        System.out.print(enemyPoke.getName());
    }



    private static void introduction() {
        //'''prints the basic introduction for the user'''
        System.out.print("Welcome to Pokemon Gigabattle!");
        System.out.print("\nYou will choose your starter and then \nenter a role-based pokemon boss-battle!");
    }

    private static Pokemon choosestarter() {
        //'''allows the user to choose their starter pokemon'''
        System.out.print("Choose your starter pokemon!");
        System.out.print("Type 1 for Chimchar, the fiersty fire-type chimp!");
        System.out.print("Type 2 for Piplup, the cool water-type penguin!");
        System.out.print("Type 3 for Turtwig, the humble grass-type turtle!\n");

        Scanner choice = new Scanner(System.in);
        System.out.print("Enter the number of your choice: ");
        String starterChoice = choice.nextLine();
        if (starterChoice.equalsIgnoreCase("1")) {
            System.out.print("\nYou chose Chimchar!");
            Pokemon chimchar = new Pokemon();
            chimchar.setName("Chimchar");
            chimchar.setHp(534);
            chimchar.setDefense(76);
            chimchar.setAttack(104);
            chimchar.setType1("Fire");
            chimchar.setType2("Fighting");
            return chimchar;
        }
        else if (starterChoice.equalsIgnoreCase("2")) {
            System.out.print("\nYou chose Piplup!");
            Pokemon piplup = new Pokemon( );
            piplup.setName("Piplup");
            piplup.setHp(530);
            piplup.setDefense(86);
            piplup.setAttack(84);
            piplup.setType1("Water");
            piplup.setType2("Steel");
            return piplup;
        }
        else {
            System.out.print("\nYou chose Turtwig!");
            Pokemon turtwig = new Pokemon( );
            turtwig.setName("Piplup");
            turtwig.setHp(525);
            turtwig.setDefense(109);
            turtwig.setAttack(95);
            turtwig.setType1("Grass");
            turtwig.setType2("Ground");
            return turtwig;
        }
    }

    private static Pokemon generateEnemy(List<Pokemon> pokeList) {
        Random randPicker = new Random();
        return pokeList.get(randPicker.nextInt(pokeList.size()));
    }


}
