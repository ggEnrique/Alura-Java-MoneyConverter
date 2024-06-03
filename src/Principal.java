import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int userInput = 0;
        double amount = 0.0;
        String baseCode = "";
        String targetCode = "";
        ConsultarExchange consultarExchange = new ConsultarExchange();
        Scanner scanner = new Scanner(System.in);
        Messages messages = new Messages();

        while (true) {
            messages.printMenu();
            userInput = scanner.nextInt();

            if (userInput == 7) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Input the amount you would like to convert");
            amount = scanner.nextDouble();

            switch (userInput) {
                case 1 -> { baseCode = "USD"; targetCode = "MXN"; }
                case 2 -> { baseCode = "MXN"; targetCode = "USD"; }
                case 3 -> { baseCode = "BRL"; targetCode = "MXN"; }
                case 4 -> { baseCode = "MXN"; targetCode = "BRL"; }
                case 5 -> { baseCode = "USD"; targetCode = "BRL"; }
                case 6 -> { baseCode = "BRL"; targetCode = "USD"; }
                default -> {
                    System.out.println("Invalid option. Please choose a valid option.");
                    continue;
                }
            }

            Exchange exchange = consultarExchange.exchangeRate(baseCode, targetCode, amount);
            System.out.printf("Conversion rate from %s to %s: %.4f%n", baseCode, targetCode, exchange.conversion_rate());
            System.out.printf("Conversion result for amount %.2f: %.4f%n", amount, exchange.conversion_result());
        }

        scanner.close();
    }
}
