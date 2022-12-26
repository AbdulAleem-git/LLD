package DesignPattern.observerdesignpattern.observable;

import DesignPattern.observerdesignpattern.observer.NotificationAlerter;

public interface StockObservable {
    public void add(NotificationAlerter alerter);
    public void remove(NotificationAlerter alerter);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int  getStockCount();
}
