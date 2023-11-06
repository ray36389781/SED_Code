import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main (String[] args) {
        var application = new Application();
		try {
			var reader = new BufferedReader(new FileReader(args[0]));
			String line;
			Document curr;
			while ((line = reader.readLine()) != null && !line.isEmpty() ) {
				var tokens = line.split(" ");
				if (tokens.length == 1) {
					var cmd = tokens[0];
					switch (cmd) {
                        case "Draw":
                            curr = application.create(cmd);
                            application.manage(curr);
                            break;
                        case "Text":
                            curr = application.create(cmd);
                            application.manage(curr);
                            break;
                        case "Present":
                            application.present();
                            break;
                        default:
                            System.out.println("Unknown command: " + cmd);
                    }
				}
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
	}	
}
