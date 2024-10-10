package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



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
    
    
    /*for (int num : nums) {
        System.out.println(num);
    }*/
    input.close();
    }

    public static int[] Myrandom(int hi, int lo, int n){
        int nums[] = new int[n]; //// Tömb inicializálása a megfelelő mérettel
        Random rand = new Random();
        //int num = rand.nextInt((hi - lo) + lo);
        for (int index = 0; index < n; index++) {
            nums[index] = rand.nextInt((hi - lo +1)) + lo;
            
        }
        
        return nums;
        
    }
}
