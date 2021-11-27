package mail;

public class MailSender {
    public void sendMail(MailInfo info) {
        System.out.println("Message " + info.getText()+" was sent to " + info.getEmail()+"\n");
    }
}