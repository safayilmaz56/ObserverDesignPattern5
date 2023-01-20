import java.util.ArrayList;
import java.util.List;

public abstract class ObserverableProduct {

    private List<IObserverUser> list;
    private ProductUpdateMessage message;

    public ObserverableProduct() {
        list = new ArrayList<>();
        message = new ProductUpdateMessage();
    }
    public void addObserver(IObserverUser observerUser){
        list.add(observerUser);
    }
    public void removeObserver(IObserverUser observerUser){
        list.remove(observerUser);
    }


    public ProductUpdateMessage getMessage() {
        return message;
    }

    public void setMessage(ProductUpdateMessage message) {
        this.message = message;
    }
    public void notifyObserver(){
        for (IObserverUser obs : list){
            obs.sendNotificiation(message);
        }
    }
}
