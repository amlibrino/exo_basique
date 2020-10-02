package exo2;

import java.util.HashMap;
import java.util.Map;

public class Exo_map {


    public static HashMap<Character, Integer> nbOccurence(String chaine){

        HashMap<Character, Integer> occurences = new HashMap<>();

        for (int i=0; i < chaine.length(); i++)
        {
            char c = chaine.charAt(i);//caractere rechercher
            int s = 1;//c'est l'occurence
            if (occurences.containsKey(c)) {
                s += occurences.get(c);
            }
            occurences.put(c,s);
        }
        return occurences;

    }

    public static void main(String[] args) {

        System.out.println(nbOccurence("anticonstitutionnellement"));
    }

}
