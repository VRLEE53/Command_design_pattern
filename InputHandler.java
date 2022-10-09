package Command_design_pattern;

import java.util.HashMap;

public class InputHandler 
{
    /**
     * Data type to store the input for each command in the format input (String), command
     */
    private HashMap<String, command> commands = new HashMap<String, Command>();

    /**
     * Initializing the Hashmap to store the String version of the Command and their respective command
     * @param document
     */
    public InputHandler(Document document)
    {
        commands.put("save", SaveCommand(document));
        commands.put("view", ViewCommand(document));
        commands.put("append", AppendCommand(document));
        commands.put("write", WriteCommand(document));
    }

    public void inputEntered(String data)
    {
        
    }
}
