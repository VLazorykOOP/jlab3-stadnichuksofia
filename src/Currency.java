public abstract class Currency {
    protected double amount; // Кількість грошей

    // Конструктор
    public Currency(double amount) {
        this.amount = amount;
    }

    // Абстрактний метод для переводу суми в гривні
    public abstract double convertToUAH();

    // Абстрактний метод для виводу на екран
    public abstract void display();

    // Перевизначення методу toString
    @Override
    public String toString() {
        return String.format("%.2f %s", amount, getCurrencySymbol());
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Currency currency = (Currency) obj;
        return Double.compare(currency.amount, amount) == 0;
    }

    // Абстрактний метод для отримання символу валюти
    public abstract String getCurrencySymbol();
}
