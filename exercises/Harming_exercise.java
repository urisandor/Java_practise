import java.util.Scanner;

class Harming{

    public int harming(String word_1, String word_2){
        
        if (word_1.length() != word_2.length()) {
            System.out.println("Nem gyenlo a ket String hossza!!");
            System.exit(1);
        }
        
        int result = 0;

        char[] c1 = word_1.toCharArray();
        char[] c2 = word_2.toCharArray();
        for (int i = 0; i < c2.length; i++) {
            if (c1[i] != c2[i]) {
                result++;
            }
        }
        return result;
    }

}
public class Harming_exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adj meg egy stringet: ");
        String word_1 = input.next();

        System.out.print("Adj meg egy stringet: ");
        String word_2 = input.next();
        Harming harming = new Harming();

        int result = harming.harming(word_1, word_2);

        System.out.println("A Harming tavolsag: " + result);
        input.close();
    }
}
