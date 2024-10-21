public class Main_PyUtils {
    public static void main(String[] args) {
        
        PyUtils py = new PyUtils();

        py.range(0, 5);
        py.range(3, 7);
        py.range(3, 4);
        py.range(3, 3);
        py.range(10);
        py.range(1);
        py.range(0);
        py.range(-4);
        py.range(4, 20, 2);
        py.range(4, 10, 1);
        py.range(10, 4, 1);
    }
}
