import java.util.ArrayList;

public class BaseFormat extends TextView {
	public BaseFormat() {
		this.setText("");
		this.elements = new ArrayList<Element>(); 
	}
	@Override
	public void display() {
		System.out.print(this.text.getText());
		for (int i = 0 ; i < this.elements.size() ; i++ ) {
			if (i > 0 || this.text.getText().length() > 0) {
				System.out.print(' ');
			}
			System.out.print(this.elements.get(i).getText());
		}
		System.out.print('\n');
	}
}
