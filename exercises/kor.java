import java.util.*;


class Circle{

    public double r;

    public Circle(double r){
        this.r = r;
    }

    public double Terulet(){
        
        double terulet = (r * r) * Math.PI;
        return terulet;
    }

    public double Kerulet(){
        
        double kerulet = 2 * r * Math.PI;
        return kerulet;
    }
}

public class kor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Add meg a kor sugarat: ");
        double r = input.nextDouble();
        Circle circle = new Circle(r);
        
        double k = circle.Kerulet();
        System.out.print("A kor Kerulete: " + k + " cm");
        System.out.println();
        System.out.println("------------------");
        double t = circle.Terulet();
        System.out.print("A kor Terulete: " + t + " cm2");

        input.close();
    }
}
