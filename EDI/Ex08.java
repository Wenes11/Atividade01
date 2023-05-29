import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class Ex08{
    public static void main(String[] args) {
        int x=2;
        int y=5;
        JOptionPane.showMessageDialog(null,"\n Valor de x = " + x);
        x++;
        JOptionPane.showMessageDialog(null,"\n Valor de y = " + y);
        y--;
        JOptionPane.showMessageDialog(null,"\n Um Novo Valor de X :" + x +"\n  Um Novo Valor :" +y);
    }
}