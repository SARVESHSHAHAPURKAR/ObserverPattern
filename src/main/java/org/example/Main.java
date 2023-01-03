package org.example;

import NotificationAlertObserver.EmailNotificationAlertObserver;
import NotificationAlertObserver.Observer;
import NotificationAlertObserver.SmsNotificationAlertObserver;
import StockObservable.IPhoneObservableImpl;
import StockObservable.Observable;

public class Main {
    public static void main(String[] args) {

        Observable observableObject = new IPhoneObservableImpl();

        Observer ob1 = new EmailNotificationAlertObserver("sarvesh@gmail.com");
        Observer ob2 = new EmailNotificationAlertObserver("mukesh@gmail.com");
        Observer ob3 = new SmsNotificationAlertObserver("9619367055");

        // ADD OBSERVERS
        observableObject.add(ob1);
        observableObject.add(ob2);
        observableObject.add(ob3);

        observableObject.setData(10);
        observableObject.setData(0);

        // REMOVE OBSERVERS
        observableObject.remove(ob2);
        observableObject.setData(100);
    }
}