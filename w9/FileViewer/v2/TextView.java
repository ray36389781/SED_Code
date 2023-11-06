import java.util.ArrayList;
public class TextView {
    public Text text;
    public ArrayList<Element> elements;
    private Format format;
    public TextView(String s) {
    	if (s.equals("BaseFormat")) {
		this.format = new BaseFormat();
	}
	this.elements = new ArrayList<Element>();
    }
    public void display() {
    	this.format.display(this.text, this.elements);
    }
    public void addScrollBar() {
        this.elements.add(new ScrollBar());
    }
    public void addThickBlackBorder() {
        this.elements.add(new thickBlackBorder());
    }
    public void setText(String s) {
	this.text = new Text();
        this.text.setText(s);
    }
}
