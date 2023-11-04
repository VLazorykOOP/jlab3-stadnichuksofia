public class EuroII implements CurrencyII {
    private double amount;

    public EuroII(double amount) {
        this.amount = amount;
    }
    @Override
    public double convertToUAH() {
        return amount * 40;
    }
    @Override
    public void display() {
        System.out.println(toString() + " (в гривнях: " + convertToUAH() + " UAH)");
    }
    @Override
    public String toString() {
        return String.format("%.2f €", amount);
    }
    @Override
    public String getCurrencySymbol() {
        return "EUR";
    }
}
