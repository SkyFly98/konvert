
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    private static boolean compare (Convert c1, Convert c2){
        return c1.getFaceit1() * c1.getFaceit2() < c2.getFaceit1() * c2.getFaceit2();
    }
    public static void main(String[] args) {

        while(true)

        {
            Scanner scanner = new Scanner(System.in);
            float f1;
            float f2;
            try {
                System.out.println("Input first convert:");
                f1 = scanner.nextFloat();
                f2 = scanner.nextFloat();
                Convert convert1 = new Convert(f1, f2);

                System.out.println("Input second convert:");
                f1 = scanner.nextFloat();
                f2 = scanner.nextFloat();
                Convert convert2 = new Convert(f1, f2);

                if (compare(convert1, convert2)) {
                    System.out.println("convert 2 is > convert 1");
                } else {
                    System.out.println("convert 2 is < convert 1");

                }

                System.out.println("hotite ewe?");

                scanner.nextLine();
                String answer = scanner.nextLine();

                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))) {
                    System.out.println("se ya");
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.print("Input error! Try again");
            }
        }

    }

}