import java.util.ArrayList;

public class Application {
    ArrayList<Document> documents;
    public Application() {
    	this.documents = new ArrayList<Document>();
    }
    public Document create(String type) {
        if (type.equals("Draw")) {
            return new DrawingDocument(this);
        }
        else if (type.equals("Text")) {
            return new TextDocument(this);
        }
	return null;
    }

    public void manage(Document document) {
        this.documents.add(document);
    }
    
    public void present() {
        for (int i = 0 ; i < this.documents.size() ; i++ ) {
            System.out.println(this.documents.get(i).getName());
        }
    }
}
