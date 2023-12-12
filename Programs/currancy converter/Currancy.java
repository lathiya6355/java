import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Currancy {
    private static Map<String, Double> conversionRates = new HashMap<>();

    static {
        conversionRates.put("USD", 1.0); // 1 USD = 1 USD
        conversionRates.put("EUR", 0.85); // 1 USD = 0.85 EUR
        conversionRates.put("GBP", 0.73); // 1 USD = 0.73 GBP
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert from (e.g., USD, EUR, GBP): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency to convert to (e.g., USD, EUR, GBP): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        if (convertedAmount == -1.0) {
            System.out.println("Invalid currencies entered.");
        } else {
            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Check if currencies exist in conversion rates map
        if (conversionRates.containsKey(fromCurrency) && conversionRates.containsKey(toCurrency)) {
            double rateFrom = conversionRates.get(fromCurrency);
            double rateTo = conversionRates.get(toCurrency);

            // Convert amount from 'fromCurrency' to 'USD' and then to 'toCurrency'
            double amountInUSD = amount / rateFrom;
            return amountInUSD * rateTo;
        } else {
            return -1.0; // Return -1.0 to indicate invalid currencies
        }
    }
}

