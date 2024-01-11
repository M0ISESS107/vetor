package vetor;
import javax.swing.*;


public class vetor {

    
    public static void main(String[] args) {
       //variaveis globais
       int contloop=1;
       String name[]={"","","","","",""};
       String msg="";
       //entrada de dados 
       while(contloop<4)
       {
           name[contloop]=JOptionPane.showInputDialog("digite o nome do aluno numero "+contloop);
           msg=msg+name[contloop]+"\n";
           contloop+=1;
       }
       JOptionPane.showMessageDialog(null,"Os nomes dos alunos são \n"+msg);
       
       //processamento
       
       
       //saida de dados
       
        
    }
    
}
