import java.util.ArrayList;

public class BaseFormat implements Format {
	public BaseFormat() {}
	@Override
	public void display(Text text, ArrayList<Element> elements) {
		System.out.print(text.getText());
		for (int i = 0 ; i < elements.size() ; i++ ) {
			if (i > 0 || text.getText().length() > 0) {
				System.out.print(' ');
			}
			System.out.print(elements.get(i).getText());
		}
		System.out.print('\n');
	}
}
