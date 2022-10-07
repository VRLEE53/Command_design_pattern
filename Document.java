package Command_design_pattern;

import java.util.ArrayList;

/**
 * 
 */
public class Document {
    String fileName;
    ArrayList<String> lines;

    public Document(String fileName){
        this.fileName = fileName;
        lines = new ArrayList<>();
        FileManipulator.writeFile(fileName, lines);
        
    }

    public String view(){
        return ViewCommand.execute();
    }

    public String append(String line){
        return AppendCommand.execute();
    }

    public String write(String line){
        return WriteCommand.execute();
    }

    public String save(){
        return SaveCommand.execute();
    }
}
