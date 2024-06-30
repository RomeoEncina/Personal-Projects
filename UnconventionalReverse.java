import javax.swing.*;
public class UnconventionalReverse {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog( "Input the string to be reversed") + "";
        StringBuffer buff = new StringBuffer(str);       
        char[] reverseMe = new char[str.length()];
        String reversed = "";
        //JOptionPane.showMessageDialog(null, str.length());
        int arrayBound = str.length();
        for (int a=0;a<arrayBound;a++){
            reverseMe[a]=str.charAt(a);
        }
        for (int b=arrayBound-1;b>=0;b--){
            reversed += reverseMe[b];
        }
        JOptionPane.showMessageDialog(null, reversed);
    }
}
