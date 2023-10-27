public class Dollar extends Currency {
    public Dollar(double amount) {
        super(amount);
    }

    // Реалізація перетворення суми в гривні
    @Override
    public double convertToUAH() {
        // Припустимо, що курс долара до гривні - 38
        return amount * 38;
    }

    // Реалізація виводу на екран
    @Override
    public void display() {
        System.out.println(toString() + " (в гривнях: " + convertToUAH() + " UAH)");
    }

    // Отримання символу валюти
    @Override
    public String getCurrencySymbol() {
        return "$";
    }
}
