package Command_design_pattern;

import java.util.Scanner;

public class WriteCommand extends Command{
    private Scanner in; 

    public WriteCommand(Document doc) {
        super(doc); 
    }
    public String execute() {
        String execute = "The line was written to the file"; 
        return execute; 
    }
}
