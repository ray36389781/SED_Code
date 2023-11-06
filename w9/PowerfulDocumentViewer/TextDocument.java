public class TextDocument extends Document {
	public TextDocument(Application a) {
		this.application = a;
	}
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
