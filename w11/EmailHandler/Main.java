import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main (String[] args) {
        var emailHandler = createEmailHandler();
		try {
			var reader = new BufferedReader(new FileReader(args[0]));
			String line;
			while ((line = reader.readLine()) != null && !line.isEmpty() ) {
				var tokens = line.split(" ");
				if (tokens.length == 1) {
					Email curr = new Email(tokens[0]);
					emailHandler.handle(curr);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
	public static EmailHandler createEmailHandler () {
		return new SpamEmailHandler();
	}	
}
