import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scan = new Scanner (System.in);

        System.out.println("Kurā skolā mācies?");

        String skola = scan.nextLine();

        System.out.println(skola);

        if(skola.equals("RCS")){
            System.out.println("Malacis!");
        } else {
            System.out.println("Mēģini vēlreiz!");
        }

        System.out.println("Cik ilgi mācies?");

        String laiks = scan.nextLine();

        System.out.println(laiks);

        if(laiks.equals("Vienu mēnesi")){
            System.out.println("Oho, nekas daudz!");
        } else {
            System.out.println("Neticu!");
        }

        System.out.println("Vai domā turpināt mācīties RCS skolā?");

        String domas = scan.nextLine();

        System.out.println(domas);

        if(domas.equals("Jā, protams")){
            System.out.println("Forši, tad tiekamies nākamajos kursos!");
        } else {
            System.out.println("Nekas, gan jau tiksimies tomēr!");
        }





    }
}





