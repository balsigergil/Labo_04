package ch.heig.gen.labo4;

public class Price {

    private final double amount;
    private final String currency;

    public Price(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"price\": ");
        sb.append(amount);
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(currency);
        return sb.toString();
    }
}
