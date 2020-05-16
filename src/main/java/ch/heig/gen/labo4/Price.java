package ch.heig.gen.labo4;

public class Price {

    private final double amount;
    private final String currency;

    public Price(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    void getPriceContents(StringBuilder sb, Product product) {
        sb.append("\"price\": ");
        sb.append(product.getPrice().getAmount());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(product.getPrice().getCurrency());
    }
}
