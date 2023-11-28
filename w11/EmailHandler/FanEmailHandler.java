public class FanEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = null;
    void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Forward to CEO.");
        }
        else {
            nextHandler.handle(email);
        }
    }

    private boolean isSelf (Email email) {
        return email.type == "FAN";
    }

    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}