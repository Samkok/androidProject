import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Main extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    
    private JTabbedPane tabPane;
    
    public static void main(String[] args){
        new Main().setVisible(true);
    }
    
    private Main() {
        super("Words");
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void initailize() {
        tabPane = new JTabbedPane();
        
        WordDocument doc = new WordDocument();
        
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newDoc = new JMenuItem("New Document");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveas = new JMenuItem("Save as");
        JMenuItem close = new JMenuItem("Exit");
        
        JMenuItem[] items = {newDoc, open, save, saveas, close};
        for (JMenuItem item : items) {
            item.addActionListener(this);
            file.add(item);
        }
        
        bar.add(file);
        setJMenuBar(bar); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        String name = e.getActionCommand();
        
        if (name.equals("Click me")) {
            System.out.println("Click me tapped");
        } else if (name.equals("Button 2")) {
            System.out.println("Button 2 clicked");
        } else if (name.equals("Exit")) {
            System.out.println("Closed");
            System.exit(0);
        } else if (name.equals("Save")) {
            save();
        }
    }
    
    public void save() {
        
    }
    
    public void open() {
        JFileChooser chooser = new JFileChooser("./");
        
        File file = chooser.getSelectedFile();
        
        WordDocument doc = new WordDocument(file, new JTextArea());
        
        int returned = chooser.showOpenDialog(this);
        
        if (returned == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            
                
            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
