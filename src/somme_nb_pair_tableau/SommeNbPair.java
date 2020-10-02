package somme_nb_pair_tableau;

public class SommeNbPair {

    //calculer la somme des nombre pair dans un tableau
    public static int sommeNbPairs(int[]tab) {
        int somme = 0;
        for (int i = 0; i <= tab.length; i++) {
            if (tab[i] % 2 == 0) {
                somme += tab[i];
            }
        }
        return somme;
    }

    //calculer la somme des deux tableau
/*
    public static int sommeDeuxTableau(int[] tab3){
        int[] tab1 = {1, 12, 5, 4};
        int[] tab2 = {15, 4, 5, 2};
        int[] tab3 ;
        int f = 0;
        for(int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                tab3[f]=tab1[i]+tab2[j];
                f++;
            }
            }

        return tab3[f];
    }*/

    // la somme des nombre inferieur
    public static int sommeNbInferieur(int n){
        int total = 0;

        for (int i = 1; i<=n; i++)
        {
            total = total + i;
            System.out.print( i + " + ");
        }
        return total;
    }

    // la somme des nombre entier inferieur
    public static int sommeEntier(int n){
        int somme = 0;

        for (int i = 1; i<=n; i++)
        {
            somme = somme + i;
            System.out.print( i + " + ");
        }
        return somme;
    }



    //Exemple 1: Programme pour calculer la somme d’un tableau
        public static void sommeTableau (String[] args){
            int[] tab = {1, 2, 3, 4, 5};
            int somme = 0;
            for( int i : tab) {
                somme = somme + i;
            }
            System.out.println("La somme des éléments du tableau est : "+ somme);
        }

    public static void main(String[] args) {
        //System.out.println(sommeDeuxTableau());

        System.out.println(" la somme des nombres est : " + sommeNbInferieur(9));
    }
}
