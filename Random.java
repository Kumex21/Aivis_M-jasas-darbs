import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random() ;
        int randomInt = rnd.nextInt(15);

        int numb;
        System.out.println("Tev ir jāuzmin skaitlis no 1 līdz 15" ) ;

        numb = scan.nextInt();

        if (numb == randomInt) {
            System.out.println("Pareizi");

        } else if (numb > rnd.nextInt()){
            System.out.println("Diemžēl nepareizi.");
        }
    }
}