package Command_design_pattern;

import java.util.Scanner;

/**
 * Overwrites a file with a new line of text
 */
public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in); 

    /**
     * initializes what document we are working with
     * @param document the document in question
     */
    public WriteCommand(Document document) {
        super(document); 
    }

    /**
     * prompts user for text, then calls the write method in document
     */
    public String execute() {
        System.out.print("Enter Text: ");
        String line = in.nextLine();
        return document.write(line); 
    }
}
