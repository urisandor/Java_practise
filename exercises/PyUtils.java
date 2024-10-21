import java.util.*;
class PyUtils {
    
    static void range(int a, int b){
        List<Integer> list = new ArrayList<>();
        if (a == b) {
            System.out.println(list);
        }
        else if (a < b) {
            for (int i = a; i < b; i++) {
                list.add(i);
            }
            
            System.out.println(list);
        }
        
    }

    static void range(int a){
        List<Integer> list = new ArrayList<>();
        if (a <= 0) {
            System.out.println(list);
        }
        else{
            for (int i = 0; i < a; i++) {
                list.add(i);
            }
            System.out.println(list);
        }
        
    }

    static void range(int a, int b, int c){
        List<Integer> list = new ArrayList<>();
        
        for (int i = a; i < b; i+=c) {
            list.add(i);
        }

        System.out.println(list);
    }
}
