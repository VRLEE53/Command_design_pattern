package Command_design_pattern;

import java.util.Scanner;

public class AppendCommand extends Command{
    private Scanner in; 
    public AppendCommand(Document doc) {
        super(doc);  
    }
    public String execute() {
        String execute = "The line has been appended to the document.";
        return execute; 
    }
    
}
