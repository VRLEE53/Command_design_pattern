package Command_design_pattern;

import java.util.Scanner;

/**
 * Appends text to a file
 */
public class AppendCommand extends Command{
    private Scanner in = new Scanner(System.in); 

    /**
     * initializes what document we are working with
     * @param document the document in question
     */
    public AppendCommand(Document document) {
        super(document);  
    }
    
    /**
     * prompts user for text, then calls the append method in document
     */
    public String execute() {
        System.out.print("Enter Text: ");
        String line = in.nextLine();
        return document.append(line);
    }
    
}
