public class ComplaintEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = new FanEmailHandler();
    void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Forward to legal department.");
        }
        else {
            nextHandler.handle(email);
        }
    }

    private boolean isSelf (Email email) {
        return email.type == "COMPLAINT";
    }

    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}