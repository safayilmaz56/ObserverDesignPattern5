public class Main {
    public static void main(String[] args) {
        IObserverUser mehmet = new ObserverUser();
        IObserverUser derya = new ObserverUser();
        IObserverUser sema = new ObserverUser();
        IObserverUser aleyna = new ObserverUser();

        Samsung samsung = new Samsung();

        samsung.addObserver(mehmet);
        samsung.addObserver(derya);
        samsung.addObserver(sema);
        samsung.addObserver(aleyna);

        samsung.changePrice();
    }
}