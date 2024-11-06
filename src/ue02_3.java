import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {

        Out.println("X Koordinate: ");
        double x = In.readDouble();
        Out.println("Y Koordinate: ");
        double y = In.readDouble();

            if (x <= 4 && x >= 0 && y <= 4 && y >= 0 && Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) >= 4){
            Out.println("Der Punkt liegt auf der grünen Fläche.");
        }
        else{
            Out.println("Der Punkt liegt nicht auf der grünen Fläche.");
        }
    }
}
