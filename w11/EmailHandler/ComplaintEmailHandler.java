public class ComplaintEmailHandler implements EmailHandler {
    private EmailHandler nextHandler = new FanEmailHandler();
    public void handle (Email email) {
        if (isSelf(email)) {
            System.out.println("Forward to legal department.");
        }
        else if (this.nextHandler!=null){
            nextHandler.handle(email);
        }
    }

    public boolean isSelf (Email email) {
        return email.type.equals("COMPLAINT");
    }

    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }
}
