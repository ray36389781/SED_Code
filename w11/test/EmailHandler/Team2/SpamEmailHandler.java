public class SpamEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = new ComplaintEmailHandler();
    public void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Put mail to the spam box.");
        }
        else if (this.nextHandler!=null){
            nextHandler.handle(email);
        }
    }

    public boolean isSelf (Email email) {
        return email.type.equals("SPAM");
    }

    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}
