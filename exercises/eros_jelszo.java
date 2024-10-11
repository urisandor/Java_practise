import java.util.Scanner;

public class eros_jelszo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a strong password: ");

        String password = input.nextLine();
        boolean result = MyPassword(password);
        System.out.println(result);
        input.close();
    }

    public static boolean MyPassword(String password){
        boolean carlo = false;
        boolean carhi = false;
        boolean carnum = false;
        int numcount = 0;
        boolean carspec = false;

        for (int i = 0; i < password.length(); i++) {
            
            if (Character.isUpperCase(password.charAt(i)) == true) {
                carhi = true;
            }
            if (Character.isLowerCase(password.charAt(i)) == true) {
                carlo = true;
            }
            if (Character.isDigit(password.charAt(i)) == true) {
                numcount += 1;
            }
            if (password.charAt(i) == ';' || password.charAt(i) == '.' || password.charAt(i) == ':' || password.charAt(i) == ',') {
                carspec = true;
            }

        }
        if (numcount >= 2) {
            carnum = true;
        }

        if (carhi && carlo && carnum && carspec) {
            return true;
        }
        return false;
    }
}
