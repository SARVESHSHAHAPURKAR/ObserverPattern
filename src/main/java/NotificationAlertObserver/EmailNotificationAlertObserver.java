package NotificationAlertObserver;

public class EmailNotificationAlertObserver implements Observer{

    String emailId;

    public EmailNotificationAlertObserver(String emailId){
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending email to "+emailId);
    }
}
