package Command_design_pattern;

import java.util.ArrayList;

/**
 * a document depicted in code
 */
public class Document {
    String fileName;
    ArrayList<String> lines;

    /**
     * creates a new file
     * @param fileName name of file 
     */
    public Document(String fileName){
        this.fileName = fileName;
        lines = new ArrayList<>();
        FileManipulator.writeFile(fileName, lines);
        
    }

    /**
     * formats the file 
     * @return the file formatted
     */
    public String view(){
        String document = border();

        for(String line : lines){
            document += "/n|     " + line;
            int space = longestLine() - line.length();

            for (int i = 0; i <= space; i++){
                document += " ";
            }

            document += "     |";
        }
        document += border();

        return document;
    }

    /**
     * counts the length of each line
     * @return the length of the longest line
     */
    private int longestLine(){
        int width = 0;
        for (String line : FileManipulator.readFile(fileName)){
            if (line.length() > width)
                width = line.length();
        }       
        return width;
    }

    /**
     * creates a border to go around the file
     * @return the border with the correct amount of spaces
     */
    private String border(){
        String border = "/n";
        for(int i = 0; i <= longestLine() + 10; i++){
            border += "_";
        }
        border+="/n";
        return border;
    }

    /**
     * adds a new line to the end of the document
     * @param line the line to be added
     * @return a confirmation that the line was added
     */
    public String append(String line){
       lines.add(line);
       return "The line has been appended to the document /n";
    }

    /**
     * overwrites the file with a new line
     * @param line the line to be added
     * @return a confirmation that the line was written into the file
     */
    public String write(String line){
        lines.clear();
        lines.add(line);
        return "The line was written to the file /n";
    }

    /**
     * saves the file permanently
     * @return a confirmation that the file has been saved
     */
    public String save(){
        try {
            FileManipulator.writeFile(fileName, lines);
            return "The file has been saved /n";
        } catch (Exception e) {
            return "Sorry, we cannot save at this time /n";
        }
    }
}
