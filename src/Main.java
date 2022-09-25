import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To select the required refrigerant, please enter the boiling point in Celsius degrees");

        while (!scanner.hasNextInt()) {
            System.out.println("It`s not a number");
            scanner.nextLine();
        }
        int boilingTemp = scanner.nextInt();

        if (boilingTemp < 10 || boilingTemp > -5) {
            Refrigerant requireRefrigerant1 = new R134a();
        } else if (boilingTemp > 11 || boilingTemp < 15) {
            Refrigerant requireRefrigerant2 = new R1314z();
        } else if (boilingTemp > 15 || boilingTemp < 20) {
            Refrigerant requireRefrigerant = new R410a();
        } else {
            System.out.println("Boiling temperature out of the range");
        }


    }
}

