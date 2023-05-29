import javax.swing.JPopupMenu;

import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] args) {
        int c;
    
        float num,res;
        for(c=1;c<=5;c++){
            num=Float.parseFloat(JOptionPane.showInputDialog("Digite um numeros :"));
            //res= num*num;
            JOptionPane.showMessageDialog(null,"Resultado e" + Math.pow(num, 2));
        }
    }
}
