public class FanEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = null;

    @Override
    public void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Forward to CEO.");
        }
        else {
            nextHandler.handle(email);
        }
    }

    @Override
    public boolean isSelf (Email email) {
        return email.type == "FAN";
    }

    @Override
    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}
