
import java.io.File;
import javax.swing.JTextArea;

public class WordDocument {

    private static String fileName;
    private static String JTextArea;
    
    public WordDocument(String fileName, String JTextArea) {
        this.fileName = fileName;
        this.JTextArea = JTextArea;
    }
    
    public WordDocument() {
        getName();
        this.JTextArea = "";
    }

    WordDocument(File file, JTextArea jTextArea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getName() {
        
    }
    
}
