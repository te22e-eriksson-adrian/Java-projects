import java.util.Scanner;

// Kommentar på endast en rad. (test)

/*
 Namn på skapare av startskärmen: Adrian Eriksson
 Klass: Te22E
 Beskrivning: En spelskärm som är gjord som ett test för att jag ska träna på att använda java.
 */

//import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Hur gammal är du?: ");
        int ålder = tangentbord.nextInt();
        tangentbord.nextLine();

        System.out.println("Du är: "+ålder+" år gammal");
        System.out.println("                            ");
        System.out.println("      The X-Cross Game      ");
        System.out.println("XXXXXXXXXXX     XXXXXXXXXXXX");
        System.out.println(" XXXXXXXXXXX   XXXXXXXXXXXX ");
        System.out.println("  XXXXXXXXXXX XXXXXXXXXXXX  ");
        System.out.println("   XXXXXXXXXXXXXXXXXXXXXX   ");
        System.out.println("    XXXXXXXXXXXXXXXXXXXX    ");
        System.out.println("     XXXXXXXXXXXXXXXXXX     ");
        System.out.println("      XXXXXXXXXXXXXXXX      ");
        System.out.println("       XXXXXXXXXXXXXX       ");
        System.out.println("        XXXXXXXXXXXX        ");
        System.out.println("       XXXXXXXXXXXXXX       ");
        System.out.println("      XXXXXXXXXXXXXXXX      ");
        System.out.println("     XXXXXXXXXXXXXXXXXX     ");
        System.out.println("    XXXXXXXXXXXXXXXXXXXX    ");
        System.out.println("   XXXXXXXXXXXXXXXXXXXXXX   ");
        System.out.println("  XXXXXXXXXXX XXXXXXXXXXXX  ");
        System.out.println(" XXXXXXXXXXX   XXXXXXXXXXXX ");
        System.out.println("XXXXXXXXXXX     XXXXXXXXXXXX");
        System.out.println(" Developer: Adrian Eriksson ");
        System.out.println("                            ");
        
        System.out.println("Skapa karaktär!");
        System.out.print("Ange namnet på din karaktär: ");
        String namn = tangentbord.nextLine();
        System.out.print("Hur lång ska din karaktär vara?: ");
        double längd = tangentbord.nextDouble();
        tangentbord.nextLine();
        System.out.print("Vad för vapen ska din karaktär ha?: ");
        String vapen = tangentbord.nextLine();
        System.out.print("Vad är din spelkaraktärs transportmedel?: ");
        String fordon = tangentbord.nextLine();
        tangentbord.close();

        System.out.println("                                                ");
        System.out.println("Din karaktär heter: "+namn+" och är "+längd+" lång.");
        System.out.println(namn+" har alltid med sig sin "+vapen+" och förflyttar sig effektivt med hjälp av sin "+fordon+".");
        System.out.println("                                    ");

        /*
        int tal1;
        int tal2;
        
        tal1 = 4;
        tal2 = 2;

        System.out.println("tal1 = "+tal1);
        System.out.println("tal2 = "+tal2);

        int summa;
        int produkt;
        int kvot;

        summa = tal1 + tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);

        summa = tal1 - tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);

        produkt = tal1 * tal2;
        System.out.println(tal1+"*"+tal2+"="+produkt);

        kvot = tal1 / tal2;
        System.out.println(tal1+"/"+tal2+"="+kvot);
        
        System.out.println("                  ");

        int tal3 = 11;
        int tal4 = tal3 + 10;

        System.out.println("tal3 = "+tal3+", tal4 ="+tal4);

        int tal5 = tal4 / 2;

        tal5=tal5+10;
        System.out.println("tal5 = "+tal5);

        int tal6 = 5;
        System.out.println("tal6 = "+tal6);

        tal6 = tal6 * 10;
        System.out.println("tal6 = "+tal6);

        System.out.println(tal1+"+"+tal2+"*"+tal3+"="+(tal1+tal2*tal3));
        System.out.println("("+tal1+"+"+tal2+")"+"*"+tal3+"="+((tal1+tal2)*tal3));
        */
    }
}
