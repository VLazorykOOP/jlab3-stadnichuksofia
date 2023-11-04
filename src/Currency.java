public abstract class Currency {
    protected double amount;

    // Конструктор
    public Currency(double amount) {
        this.amount = amount;
    }

    public abstract double convertToUAH();

    public abstract void display();

    // Перевизначення методу toString
    @Override
    public String toString() {
        return String.format("%.2f %s", amount, getCurrencySymbol());
    }

    // Перевизначення
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Currency currency = (Currency) obj;
        return Double.compare(currency.amount, amount) == 0;
    }
    public abstract String getCurrencySymbol();
}
