public class Samsung extends ObserverableProduct{

    public void changePrice(){
        super.getMessage().productName = "Samsung";
        this.getMessage().message = "Samsung's price updated";
        this.notifyObserver();
    }
}
