import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class ThreesFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        char[] chars = string.toCharArray();
        StringBuilder newString = new StringBuilder();
        for(char c:chars){
            if(c=='e'||c=='E'){
                newString.append(3);
            }else{
                newString.append(c);
            }
        }
        string = newString.toString();
        super.insertString(fb, offset, string, attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        char[] chars = text.toCharArray();
        StringBuilder newString = new StringBuilder();
        for(char c:chars){
            if(c=='e'||c=='E'){
                newString.append(3);
            }else{
                newString.append(c);
            }
        }
        text = newString.toString();
        super.replace(fb, offset, length, text, attrs);
    }
}
