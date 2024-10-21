import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class lotto {
    public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);

    System.out.print("Hány db random számot kérsz?");
    int n = input.nextInt();

    System.out.print("Alsó határ: ");
    int lo = input.nextInt();

    System.out.print("Felső határ (zárt intervallum): ");
    int hi = input.nextInt();
    
    int[] nums = Myrandom(hi,lo,n);
    Arrays.sort(nums);

    for (int num : nums) {
        System.out.println(num);
    }
    input.close();


    }

    public static int[] Myrandom(int hi, int lo, int n){
        /*int nums[] = new int[n]; //// Tömb inicializálása a megfelelő mérettel
        Random rand = new Random();
        int current;
        //int num = rand.nextInt((hi - lo) + lo);
        for (int index = 0; index < n; index++) {
            current = rand.nextInt((hi - lo +1)) + lo;
            nums[index] = current;      
        }
        return nums;*/
        

        // Létrehozzuk az összes lehetséges számot tartalmazó listát
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            allNumbers.add(i);
        }

        // Véletlenszerűen összekeverjük a listát
        Collections.shuffle(allNumbers, new Random());

        // Az első n számot kiválasztjuk a listából
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = allNumbers.get(i);
        }

        return result;
    }
}
