import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {

        Out.println("Geben Sie drei Zahlen ein:");

        int a = In.readInt();
        int b = In.readInt();
        int c = In.readInt();

        Out.println("Die höchste Zahl ist:");

        if (a >= b && a >= c){
            Out.println(a);
        }
        else if (b >= a && b >= c){
            Out.println(b);
        }
        else {
            Out.println(c);
        }
    }
}
