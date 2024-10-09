package exercises;

import java.util.*;

class Ora{

    private int code;
    private String name;
    private int start;
    public Ora(){
        this.code = code;
        this.name = name;
        this.start = start;
    }

    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getStart(){
        return start;
    }
    public void setStart(int start){
        this.start = start;
    } 

    @Override
    public String toString(){
        return String.format("%d, %s, %d" ,code, name, start);
    }
    

}

public class masodik_feladat {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Add meg az orad kodjat:");
    int code = input.nextInt();

    System.out.print("Add meg az orad nevet:");
    String name = input.next();

    System.out.print("Add meg az orad kezdetet:");
    int start = input.nextInt();
    
    if (start < 8 || start > 19) {
        System.err.println("Nincs ilyen idopontban ora!!");
        System.exit(1);
    }
    
    System.out.println("Az orad kodja: " + code);
    System.out.println("Az orad neve: " + name);
    System.out.println("Az orad " + start + "-kor fog kezdodni.");
    }
}
