public class Euro extends Currency {
    public Euro(double amount) {
        super(amount);
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
    public String getCurrencySymbol() {
        return "€";
    }
}
