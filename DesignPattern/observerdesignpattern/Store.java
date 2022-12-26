package DesignPattern.observerdesignpattern;

import DesignPattern.observerdesignpattern.observable.IphoneObservableImpl;
import DesignPattern.observerdesignpattern.observer.EmailAlertObserver;
import DesignPattern.observerdesignpattern.observer.MobileAlertObserver;
import DesignPattern.observerdesignpattern.observer.NotificationAlerter;

class Store {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservableImpl = new IphoneObservableImpl();

        NotificationAlerter observer1 = new EmailAlertObserver("zah7131", iphoneObservableImpl);
        NotificationAlerter observer2 = new EmailAlertObserver("abd@gmail.com", iphoneObservableImpl);
        NotificationAlerter observer3 = new MobileAlertObserver("abdulaleem@gmail.com", iphoneObservableImpl);

        iphoneObservableImpl.add(observer1);
        iphoneObservableImpl.add(observer2);
        iphoneObservableImpl.add(observer3);

        iphoneObservableImpl.setStockCount(10);
    }
}