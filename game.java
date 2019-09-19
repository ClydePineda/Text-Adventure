/**
 * game
 */
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        player p = new player();
        try {
            System.out.println("Enter Name:");
            p.name = scan.nextLine();
            System.out.println("Enter Age:");
            p.age = scan.nextInt();
            System.out.println("Enter Weight (lbs):");
            p.weight = scan.nextDouble();
            System.out.println("Enter Height (ft):");
            int feet = scan.nextInt();
            System.out.println("Enter Height (in)");
            int inch = scan.nextInt();
            p.height = feet +"ft " + inch + "in" ;
            System.out.println("Hello " + p.name +" your age is " + p.age + " weigh  " + p.weight + "lbs"  + " and " + p.height + " tall.");
        } finally{
            scan.close();
        }
    }
}