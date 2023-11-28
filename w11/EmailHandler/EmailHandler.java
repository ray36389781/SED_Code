public interface EmailHandler {
    EmailHandler nextHandler;
    public void handle(Email email);
    private boolean isSelf(Email email);
    public setNextHandler(EmailHandler handler);
}