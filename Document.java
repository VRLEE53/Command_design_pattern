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
               
        return "";
    }

    public String append(String line){
       lines.add(line);
       return "The line has been appended to the document";
    }

    public String write(String line){
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }

    public String save(){
        FileManipulator.writeFile(fileName, lines);
        return "The file has been saved";
    }
}
