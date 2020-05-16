package ch.heig.gen.labo4;

public class Product {
    private final String code;
    private final Color color;
    private final Size size;
    private final Price price;

    public Product(String code, Color color, Size size, Price price) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Size getSize() {
        return size;
    }

    public Price getPrice() {
        return price;
    }

    String getColorName() {
        return color.toString();
    }

    String getSizeName() {
        return size.name();
    }

    String toJSON() {
        StringBuilder sb = new StringBuilder();

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
        sb.append(getPrice().getAmount());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getPrice().getCurrency());
        sb.append("\"}, ");

        return sb.toString();
    }
}