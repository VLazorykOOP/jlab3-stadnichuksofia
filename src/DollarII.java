public class DollarII implements CurrencyII {
    private double amount;

    public DollarII(double amount) {
        this.amount = amount;
    }
    @Override
    public double convertToUAH() {
        return amount * 38;
    }
    @Override
    public void display() {
        System.out.println(toString() + " (в гривнях: " + convertToUAH() + " UAH)");
    }
    @Override
    public String toString() {
        return String.format("%.2f $", amount);
    }
    @Override
    public String getCurrencySymbol() {
        return "$";
    }
}
