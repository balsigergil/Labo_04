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

    String toJSON() {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color.toString());
        sb.append("\", ");

        if (size != Size.NONE) {
            sb.append("\"size\": \"");
            sb.append(size.name());
            sb.append("\", ");
        }

        sb.append(price.toJSON());
        sb.append("\"}, ");

        return sb.toString();
    }

}