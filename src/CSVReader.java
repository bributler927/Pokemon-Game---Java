import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private static List<Pokemon> pokeList;

    public static void main(String[] args) {
        String pokeFile = "data/Pokemon.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Pokemon> pokeList = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(pokeFile));
            while ((line = br.readLine( )) != null) {
                Pokemon poke = new Pokemon( );
                String[] pokemon = line.split(cvsSplitBy);
                poke.setName(pokemon[1]);
                poke.setType1(pokemon[2]);
                poke.setType2(pokemon[3]);
                poke.setHp(Integer.parseInt(pokemon[4]));
                poke.setAttack(Integer.parseInt(pokemon[5]));
                poke.setDefense(Integer.parseInt(pokemon[6]));

                pokeList.add(poke);
                //System.out.println("Pokemon [code= " + pokemon[1] + " , HP=" + pokemon[4] + "]");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace( );
        } catch (IOException e) {
            e.printStackTrace( );
        } finally {
            if (br != null) {
                try {
                    br.close( );
                } catch (IOException e) {
                    e.printStackTrace( );
                }
            }
        }


    }

    public static List<Pokemon> getPokeList() {
        return pokeList;
    }
}
