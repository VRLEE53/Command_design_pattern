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
    }

    public String view(){
        ViewCommand.execute();
    }

    public String append(String line){
        AppendCommand.exdcute();
    }

    public String write(String line){
        WriteCommand.execute();
    }

    public String save(){
        SaveCommand.execute();
    }
}
