package StockObservable;

import NotificationAlertObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements Observable{

    List<Observer> observerList = new ArrayList<Observer>();
    int stock=0;


    @Override
    public void add(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(Observer o: observerList){
            o.update();
        }

    }

    @Override
    public void setData(int stock) {

        // IF THE ITEM IS IN STOCK AGAIN, NOTIFY THE CUSTOMERS (OBSERVERS)
        if(this.stock==0 && stock>0){
            notifyObservers();
        }
        this.stock = stock;

    }
}
