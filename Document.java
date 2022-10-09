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
<<<<<<< HEAD
               
        return "";
=======
        for (String line : FileManipulator.readFile(fileName)){
            lines.add(line);
        }
        
        return null;
>>>>>>> bb74f5724eaf4d8e2ec431c2ea2595a588226de6
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
