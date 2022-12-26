package DesignPattern.observerdesignpattern.observer;

import DesignPattern.observerdesignpattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlerter {

    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(emailId, "Product is in stock hurry up!!");
        
    }
    private void sendMessageOnMobile(String emailId2, String string) {
        System.out.println("msg sent to:" + emailId);
    }    
}
