public class ObserverUser implements IObserverUser{
    @Override
    public void sendNotificiation(ProductUpdateMessage message) {
        System.out.println(message.toString());
    }
}
