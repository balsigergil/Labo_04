package ch.heig.gen.labo4;

public class Product {
    private final String code;
    private final Color color;
    private final Size size;
    private final double price;
    private final String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    String getColorName() {
        return color.toString();
    }

    String getSizeName() {
        return size.name();
    }

    void getProductContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColorName());
        sb.append("\", ");

        if (getSize() != Size.NONE) {
            sb.append("\"size\": \"");
            sb.append(getSizeName());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}