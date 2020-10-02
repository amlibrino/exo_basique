package exo_5_inverser_string;

public class InverseString {

    public static String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static void reverseString(String str) {
        char[] chaine = str.toCharArray();
        for (int i = chaine.length - 1; i >= 0; i--) {
            System.out.print(chaine[i]);
        }
    }

    public static void main(String[] args) {
        String s1 = "neelendra";
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.println(s1.charAt(i));
        }

        System.out.println(reverse("hamid benchikh"));
        reverseString("bombola");
    }

}
