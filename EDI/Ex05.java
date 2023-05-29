import javax.swing.JOptionPane;
public class Ex05 {
   public static void main(String[] args) {
    int d,a;
    a=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 3 casas "));
    d= a % 100/10;
    JOptionPane.showMessageDialog(null,"Algarismo da casa das dezenas : " + d);
   } 
}
