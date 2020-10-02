package exo3;

public class Tableau {
        /*Écrire une fonction qui recherche un objet dans un tableau. Si l'objet est trouvé, la fonction
        retourne la première position où se trouve l'objet. Sinon la fonction lève une exception
        NoSuchElementException.*/


    // facon non objet
    public static int findIndex(int[] tab, int x) throws Exception {

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == x){
                return i;
            }
        }throw new Exception("nombre non trouvé");
    }

    // facon objet
    public static int findIdexObjet (A[] tab, A x){

        for(int i = 0; i < tab.length; i++){
            if(tab[i].equals(x)){
                return i;
            }
        }throw new NoSuchElementException("nombre non trouvé");//uncheked exception
    }

    public static void main(String[] args) {
        A[] a = new A[]{new A(2),new A(5),new A(89),new A(115)};
        System.out.println(findIdexObjet(a, new A(899)));

    }


}
