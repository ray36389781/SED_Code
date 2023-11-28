public interface EmailHandler {
    public EmailHandler nextHandler = null;
    abstract public void handle(Email email);
    abstract public boolean isSelf(Email email);
    abstract public void setNextHandler(EmailHandler handler);
}
