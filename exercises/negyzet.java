import java.util.*;

class Negyzet {
    public int a;
    
    public Negyzet(int a){
        this.a = a;
    }

    public int Terulet(){
        
        int terulet = a * a;

        return terulet;
    }

    public int Kerulet(){
        
        int kerulet = 4 * a;

        return kerulet;
    }
    
}

public class negyzet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Add meg a negyzet oldalanak a hosszat: ");
        int a = input.nextInt();
        
        Negyzet negyzet = new Negyzet(a);
        
        int t = negyzet.Terulet(); 
        System.out.print("A negyzet terulete: " + t + " cm2");
        System.out.println();
        System.out.println("------------------");
        int k = negyzet.Kerulet();
        System.out.print("A negyzet Kerulete: " + k + " cm");
        
        input.close();
    }

    
}
