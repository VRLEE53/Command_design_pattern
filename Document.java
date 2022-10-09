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
        for (String line : FileManipulator.readFile(fileName)){
            lines.add(line);
        }
        
        return null;
    }

    public String append(String line){
       lines.add(line);
       FileManipulator.writeFile(fileName, lines);
    }

    public String write(String line){
        
    }

    public String save(){
        
    }
}
