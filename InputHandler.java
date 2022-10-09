package Command_design_pattern;

import java.util.HashMap;

/**
 * deals with input that the user gave
 */
public class InputHandler 
{
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * Initializing the Hashmap to store the String version of the Command and their respective command
     * @param document
     */
    public InputHandler(Document document)
    {
        SaveCommand save = new SaveCommand(document);
        commands.put("save", save);
        ViewCommand view = new ViewCommand(document);
        commands.put("view", view);
        AppendCommand append = new AppendCommand(document);
        commands.put("append", append);
        WriteCommand write = new WriteCommand(document);
        commands.put("write", write);
    }

    /**
     * runs the command that was entered
     * @param data 
     */
    public void inputEntered(String data)
    {
        for(String command: commands.keySet()){
            if (command.equals(data)){
                System.out.println(commands.get(command).execute());
            }
        }
    }
}
