package exo1;

import java.util.Arrays;
import java.util.*;

public class helloWord {

    //méthode qui calcule l'adition

    public static int addition(int x, int y) {
        return x + y;
    }
    public static int division(int x, int y) {
        if (y == 0){
            throw new ErreurDivisionException("vous ne pouvez pas diviser par Zero ! ");
        }
        return x / y;
    }

    public static void tableauMultiplication (int x){
        for(int i = 1; i<= 10 ; i++){
            System.out.println( x + " * "+ i + " = " + x*i);
        }
    }
    //permutation x et y
    public static void swap(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x : "+ x + " y : "+ y);

    }
    // fonction retounre longeur d'une chaine de caractère
    public static int longuerChaine(String chaine){
        return chaine.length();
    }

    //retourner le nombre de caractère
    public static int nbCaractere(String chaine){
        int count = 0;
        for(int i = 0; i < chaine.length(); i++){
            if (chaine.charAt(i) == ' '){
                count++;
            }
        }return count;
    }
    // retourner le nombre de voyelles dans une liste
    public static int nbVoyelle (String chaine){
        // a,e,i,o,u,y
        List<Character> voyelles = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
            int countVoyelles = 0;
            for(int i = 0; i< chaine.length(); i++){
                if(voyelles.contains(chaine.charAt(i))){
                    countVoyelles++;

            }

        }return countVoyelles;
    }


    public static void main(String[] args) {
        System.out.println("hello world");
        int result = addition(5, 4);
        System.out.println("resultat addition" + result);
        int resultDivision = division(5, 4);
        System.out.println("resultat addition" + result);
        tableauMultiplication(9);
        System.out.println(longuerChaine("test"));
        System.out.println(nbCaractere("ceci est un test"));
        System.out.println(nbCaractere("ceci est un test"));




    }

}


