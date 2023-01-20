public class ProductUpdateMessage {

    public String productName;
    public String message;

    @Override
    public String toString() {
        return String.format("%s updated. Message:%s",productName,message);
    }
}
