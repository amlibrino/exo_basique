package exo_4_nb_premier;

public class NombrePremier {

    // trouver tous les nombres premiers entre 1 et 100
    // une variable, si variable/variable = 1, ou variable / 1 = variable, ou reste >= 1;
    public static boolean isNombrePremier(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printNbPremier(int m) {
        for (int i = 1; i <= m; i++) {
            if (isNombrePremier(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printNbPremier(4);
    }
}

