package StockObservable;

import NotificationAlertObserver.Observer;

//OBSERVABLE INTERFACE
public interface Observable {

    public void add(Observer o);

    public void remove(Observer o);

    public void notifyObservers();

    public void setData(int stock);

}
