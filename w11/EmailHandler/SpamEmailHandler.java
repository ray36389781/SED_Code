public class SpamEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = new ComplaintEmailHandler();
    void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Put mail to the spam box.");
        }
        else {
            nextHandler.handle(email);
        }
    }

    private boolean isSelf (Email email) {
        return email.type == "SPAM";
    }

    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}