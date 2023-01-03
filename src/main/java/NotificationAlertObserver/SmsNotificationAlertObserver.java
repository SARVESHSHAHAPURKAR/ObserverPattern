package NotificationAlertObserver;

public class SmsNotificationAlertObserver implements Observer{

    String userName;

    public SmsNotificationAlertObserver(String userName){
        this.userName = userName;
    }


    @Override
    public void update() {
        sendSms();
    }

    private void sendSms() {
        System.out.println("Sending sms to "+userName);
    }
}
