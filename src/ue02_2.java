import libraries.Out;
import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {

        boolean check = false;
        int month = 0;

        while (!check){

            Out.println("Monat - Bitte geben Sie eine Zahl von 1 - 12 ein: ");
            month = In.readInt();

            if (month > 0 && month < 13){
                check = true;
            }
            else {
                Out.println("Ungültige Eingabe.");
            }
        }
        Out.println("Jahr - Bitte geben Sie eine Jahreszahl ein: ");
        int year = In.readInt();
        boolean schalt = false;

        if (year%400 == 0){
            schalt = true;
        }
        else if (year%100 == 0){
            schalt = false;
        }
        else if (year%4 == 0){
            schalt = true;
        }

        switch(month){
            case 1:
            Out.println("Jänner im Jahr " + year + " hat 31 Tage.");
            break;
            case 2:
            if (schalt){
            Out.println("Februar im Jahr " + year + " hat 29 Tage.");
            } else{
            Out.println("Februar im Jahr " + year + " hat 28 Tage.");
            }
            break;
            case 3:
            Out.println("März im Jahr " + year + " hat 31 Tage.");
            break;
            case 4:
            Out.println("April im Jahr " + year + " hat 30 Tage.");
            break;
            case 5:
            Out.println("Mai im Jahr " + year + " hat 31 Tage.");
            break;
            case 6:
            Out.println("Juni im Jahr " + year + " hat 30 Tage.");
            break;
            case 7:
            Out.println("Juli im Jahr " + year + " hat 31 Tage.");
            break;
            case 8:
            Out.println("August im Jahr " + year + " hat 31 Tage.");
            break;
            case 9:
            Out.println("September im Jahr " + year + " hat 30 Tage.");
            break;
            case 10:
            Out.println("Oktober im Jahr " + year + " hat 31 Tage.");
            break;
            case 11:
            Out.println("November im Jahr " + year + " hat 30 Tage.");
            break;
            case 12:
            Out.println("Dezember im Jahr " + year + " hat 31 Tage.");
            break;

        }
    }
}
