public class Currency {
    public static double currencyConverter(double dollarPrice, double dollarAmount) {
        double real = dollarPrice * dollarAmount * 1.06;
        return real;
    }
}