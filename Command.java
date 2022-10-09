package Command_design_pattern;

/**
 * A command represented in code
 */
public abstract class Command {
    protected Document document; 
    
    /**
     * Initializes a document
     * @param document
     */
    public Command(Document document) {
        this.document = document; 
    }
    
    public abstract String execute(); 
}
