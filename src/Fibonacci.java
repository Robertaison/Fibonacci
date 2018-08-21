import javax.swing.*;

public class Fibonacci {
    public static void main (String[] args){
        long atual = 1;
        long anterior = 0;
        int n=-1;
        while(n<0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite a 'n' quantidade de números desejados ver na \n" +
                                                                "Sequência Fibonacci.\n" +
                                                                "números positivos"));
        }


        if (n==0){
            JOptionPane.showMessageDialog(null, "Então não vai rolar");
        }else if(n==1){
            System.out.println(anterior);
        }
        else if(n==2){
            System.out.println(anterior);
            System.out.println(atual);
        }else{
            System.out.println(anterior);
            System.out.println(atual);
            n-=2;
            for(int i=0;i<n;i++){
                atual+=anterior;
                System.out.println(atual);
                anterior= atual-anterior;
            }
        }
    }
}
