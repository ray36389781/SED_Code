public class DrawingDocument extends Document {
	public DrawingDocument(Application a) {
		this.application = a;
	}
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
