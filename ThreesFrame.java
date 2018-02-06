import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import java.awt.*;

public class ThreesFrame extends JFrame {
    ThreesFrame(String title){
        super(title);
    }
    void init(){
        Container panel = getContentPane();
        panel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        ((AbstractDocument)textArea.getDocument()).setDocumentFilter(new ThreesFilter());
        panel.add(textArea, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(333,333);
        setVisible(true);
    }

    public static void main(String[] args) {
        ThreesFrame three = new ThreesFrame("THREE");
        three.init();
    }
}
