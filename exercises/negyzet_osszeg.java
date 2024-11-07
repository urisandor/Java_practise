public class negyzet_osszeg {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println(sum);

        int sum_2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum_2 += i;
        }
        sum_2 = sum_2 * sum_2;
        System.out.println(sum_2);
        System.out.println(sum_2 - sum);
    }
}
