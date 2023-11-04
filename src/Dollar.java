public class Dollar extends Currency {
    public Dollar(double amount) {
        super(amount);
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
    public String getCurrencySymbol() {
        return "$";
    }
}
