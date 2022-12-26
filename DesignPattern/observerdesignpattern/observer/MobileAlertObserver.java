package DesignPattern.observerdesignpattern.observer;

import DesignPattern.observerdesignpattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlerter {

    String emailId;
    StockObservable observable;

    public MobileAlertObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(emailId, "Mobile is in stock hurry up!!");
        
    }
    private void sendMessageOnMobile(String emailId2, String string) {
        System.out.println("msg sent to:" + emailId);
    }    
    
}
