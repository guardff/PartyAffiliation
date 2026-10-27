import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PartyAff ;

        // Display menu
        System.out.println("Select your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        PartyAff = scanner.next();

        // Check input string
        if (PartyAff.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (PartyAff.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (PartyAff.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

    }
}


