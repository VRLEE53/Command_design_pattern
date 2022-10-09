package Command_design_pattern;

/**
 * Saves a file 
 */
public class SaveCommand extends Command{

    /**
     * initializes what document we are working with
     * @param document the document in question
     */
    public SaveCommand(Document document) {
        super(document);
    }

    /**
     * Calls the method save in the document class
     */
    public String execute() {
        return document.save(); 
    }
}

