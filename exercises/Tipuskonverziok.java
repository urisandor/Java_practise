public class Tipuskonverziok {
    public static void main(String[] args) {
        
        String elso = "123";
        String pi = "3.14";
        String db = "7.89";
        String a = "a";

        long elso_M = Long.parseLong(elso);
        float pi_M = Float.parseFloat(pi);
        double db_M = Double.parseDouble(db);
        char a_M = a.charAt(0);

        System.out.println(elso_M);
        System.out.println(pi_M);
        System.out.println(db_M);
        System.out.println(a_M);
        /* "123"   -> long
        "3.14"  -> float
        "7.89"  -> double
        "a"     -> char*/
    }
}
