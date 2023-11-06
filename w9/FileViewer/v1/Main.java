import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main (String[] args) {
		HashMap <String, TextView> map = new HashMap<String, TextView>();
		try {
			var reader = new BufferedReader(new FileReader(args[0]));
			String line;
			while ((line = reader.readLine()) != null && !line.isEmpty() ) {
				var tokens = line.split(" ");
				if (tokens.length > 1) {
					var name = tokens[0];
					if (!map.containsKey(name)) {
						var curr = new BaseFormat();
						map.put(name, curr);
					}
					TextView textView=map.get(name);
					if (tokens[1].equals("display")) {
						if (tokens.length == 2) {
							textView.display();
						}
						else {
							System.out.println("Invalid display command.");
						}
					}
					else if (tokens[1].equals("add")) {
						if (tokens.length > 2) {
							for (int i=2;i<tokens.length;i++) {
								if (tokens[i].equals("scrollBar")) {
									textView.addScrollBar();
								}
								else if (tokens[i].equals("thickBlackBorder")) {
									textView.addThickBlackBorder();
								}
								else {
									System.out.println("Invalid add command.");
								}
							}
						}
						else {
							System.out.println("Invalid add command.");
						}
					}
					else {
						if (tokens.length == 2) { 
							textView.setText(tokens[1]);
						}
						else {
							System.out.println("Invalid text command.");
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}	
}
