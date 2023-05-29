 import javax.swing.JOptionPane;
 public class Ex07 {
    public static void main(String[] args) {
        int data,mes,ano,dia,nData;
        data=Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmmaa: "));
        dia= data/10000;
        mes= data%10000/100;
        ano=data%100;
        nData= mes*10000 +dia*100+ano;
        JOptionPane.showMessageDialog(null,"DIA : " + dia +"\n MES : " + mes + "\n ANO: " + ano +"\n  Data formato MMDDAA: " +nData);
    }
}
