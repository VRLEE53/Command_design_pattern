package Command_design_pattern;

public class SaveCommand extends Command{
    public SaveCommand(Document doc) {
        super(doc);
    }

    public String execute() {
        String execute = "The file has been saved"; 
        return execute; 
    }
}

