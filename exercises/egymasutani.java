public class egymasutani {
    public static void main(String[] args) {

        int[] values = { 1, 4, 7, 7, 7, 7 };
        int[] values1 = { 7, 7, 7, 7 };
        int[] values2 = {};
        int[] values3 = { 1, 4, 7 };
        int[] values4 = { 1, 4, 7, 7 };
        System.out.println(isConsecutiveFour(values));
        System.out.println(isConsecutiveFour(values1));
        System.out.println(isConsecutiveFour(values2));
        System.out.println(isConsecutiveFour(values3));
        System.out.println(isConsecutiveFour(values4));

    }

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        int previous = values[0];
        int count = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == previous) {
                count++;
            } else {
                previous = values[i];
            }
        }

        if (count >= 4) {
            return true;
        }
        return false;
    }
}
