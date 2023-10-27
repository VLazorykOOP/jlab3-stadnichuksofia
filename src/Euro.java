public class Euro extends Currency {
    public Euro(double amount) {
        super(amount);
    }

    // Реалізація перетворення суми в гривні
    @Override
    public double convertToUAH() {
        // Припустимо, що курс євро до гривні - 40
        return amount * 40;
    }

    // Реалізація виводу на екран
    @Override
    public void display() {
        System.out.println(toString() + " (в гривнях: " + convertToUAH() + " UAH)");
    }

    // Отримання символу валюти
    @Override
    public String getCurrencySymbol() {
        return "€";
    }
}
