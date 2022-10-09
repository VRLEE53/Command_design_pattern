package Command_design_pattern;

/**
 * Views a file
 */
public class ViewCommand extends Command{

    /**
     * initializes what document we are working with
     * @param document the document in question
     */
    public ViewCommand(Document document) {
        super(document);
    }
        
    /**
     * Calls the method view in the document
     */
    public String execute(){
        return document.view();
    }
}
