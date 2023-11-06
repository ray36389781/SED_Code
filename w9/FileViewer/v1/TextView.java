import java.util.ArrayList;
public abstract class TextView {
    public Text text;
    public ArrayList<Element> elements;
    public abstract void display();
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
