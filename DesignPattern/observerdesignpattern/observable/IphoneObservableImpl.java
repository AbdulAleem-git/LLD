package DesignPattern.observerdesignpattern.observable;

import java.util.ArrayList;
import java.util.List;

import DesignPattern.observerdesignpattern.observer.NotificationAlerter;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlerter> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlerter alerter) {
        observerList.add(alerter);
        
    }

    @Override
    public void remove(NotificationAlerter alerter) {
        observerList.remove(alerter);
        
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlerter na : observerList)
            na.update();
        
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
    
}
